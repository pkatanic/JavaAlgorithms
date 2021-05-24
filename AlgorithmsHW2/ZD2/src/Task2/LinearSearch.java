package Task2;

import java.util.Scanner;

public class LinearSearch {
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

        System.out.println("Введите элемент для  поиска: ");
        int item = sc.nextInt();
        int result = linearSearch(numbers,item);

        if (result == -1)
            System.out.println("Элемент не найден в массиве.");
        else
            System.out.println("Элемент  найден в массиве на позиций " + result);

        long end = System.nanoTime();
        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");
    }
    static int linearSearch(int values[], int target)
    {
        int n = values.length;
        for(int i = 0; i < n; i++)
        {
            if (values[i] == target)
            {
                return i;
            }
        }
        return -1;
    }
}
