package Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    static final int SIZE = 400;

    public static void main(String[] args) {
        long start = System.nanoTime();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");

        n = sc.nextInt();

        int[] numbers = new int[SIZE];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {

            numbers[i] = sc.nextInt();
        }

        System.out.println("Сортировка методом sort()");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double) elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }
}
