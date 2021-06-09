package IterativeAndRecursiveBinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {

        int n, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите размер массива:");
        n = in.nextInt();
        array = new int[n];

        System.out.println("Введите" + n + " целые числа:");

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("Введите значение для поиска:");
        search = in.nextInt();
        in.close();

        Arrays.sort(array);
        System.out.println("##########Значения массива отсортированы###############");
        printArrayValues(array);
        System.out.println("##########Двоичный поиск с использованием итерационного метода###############");
        int result = binarySearch(search, array);
        if (result < 0) {
            System.out.println(search + " нет в списке.\n");
        } else {
            System.out.println(search + " найден в месте " + result);
        }

        System.out.println("##########Рекурсивный двоичный поиск###############");
        int recursiveResult = binarySearchRecursive(search, array, 0, array.length-1);
        if (recursiveResult < 0) {
            System.out.println(search + " нет в списке.\n");
        } else {
            System.out.println(search + " найден в месте  " + recursiveResult);
        }

        System.out.println("##########Двоичный поиск с использованием коллекций###############");
        System.out.println(search + " найден в месте " + Arrays.binarySearch(array, search));
    }

    public static int binarySearch(int search, int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int middle = (start + end) / 2;

            if (search < array[middle]) {
                end = middle - 1;
            }

            if (search > array[middle]) {
                start = middle + 1;
            }

            if (search == array[middle]) {
                return middle;
            }
        }
        return -1;

    }

    public static int binarySearchRecursive(int search, int[] array, int start, int end){

        int middle = (start + end)/2;

        if(end < start){
            return -1;
        }


        if (search < array[middle]){
            return binarySearchRecursive(search, array, start, middle - 1);
        }

        if (search > array[middle]){
            return binarySearchRecursive(search, array, middle + 1, end);
        }

        if (search == array[middle]){
            return middle;
        }

        return -1;
    }

    public static void printArrayValues(int[] array){
        String coma = "";
        for (int value : array){
            System.out.print(coma + value);
            coma = ", ";
        }
        System.out.println();
    }
}
