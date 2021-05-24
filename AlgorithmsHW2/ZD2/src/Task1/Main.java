package Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов, которые вы хотите сохранить: ");

        n = sc.nextInt();

        Integer[] numbers = new Integer[10];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.println("Элементы массива: ");

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Массив отсортирован в обратном порядке " + Arrays.toString(numbers));

        Integer[] arrayCopyOne = Arrays.copyOf(numbers,13);
        System.out.println("Скопированный массив: " + Arrays.toString(arrayCopyOne));

        System.out.println("Сравнение исходного массива с копией: " + Arrays.equals(numbers, arrayCopyOne));

        Integer[] arrayCopyTwo = Arrays.copyOfRange(numbers, 2,8);
        System.out.println("Копирование части массива: " + Arrays.toString(arrayCopyTwo));

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }

}
