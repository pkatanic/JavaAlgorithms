package Task2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        int n;
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");

        n = sc.nextInt();

        int[] numbers = new int[5];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {

            numbers[i] = sc.nextInt();
        }
        System.out.println("Элементы массива: ");

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Введите элемент для бинарного поиска: ");
        int item = sc.nextInt();

        Arrays.sort(numbers);


        binarySearch(numbers,item);

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");


    }
    public static void binarySearch(int[] array, int find) {
        int first=0;
        int last = array.length-1;
        int position= (first + last) / 2;
        int comparisonCount = 1;

        while ((array[position] != find) && (first <= last)) {
            comparisonCount++;
            if (array[position] > find) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(find + " является " +position + " элементом в массиве");
            System.out.println("Метод бинарного поиска нашел число после " + comparisonCount +
                    " сравнений");
        } else {
            System.out.println("Элемент не найден в массиве. Метод бинарного поиска закончил работу после "
                    + comparisonCount + " сравнений");
        }





    }

}
