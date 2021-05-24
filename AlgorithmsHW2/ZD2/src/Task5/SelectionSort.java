package Task5;

public class SelectionSort {
    static final int SIZE = 400;
    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] intArray = new int[SIZE];

        fill(intArray);
        print(intArray);
        selectionSort(intArray);

        System.out.println("---------------");

        print(intArray);

        long end = System.nanoTime();

        long elapsedTime = end - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;
        System.out.println((seconds) + " секунд");

    }
    public static int[] fill(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    public static void selectionSort(int a[]){
        int n=a.length;
        for (int i = 0; i <n-1 ; i++) {
            // находим min элемент из еще не отсортированных элементов
            int min=i;
            int d=0;
            for (int j = i+1; j <n ; j++) {
                if(a[j]< a[min]){
                    min=j;
                }
            }
            // ставим min элемент на нужное место
            d=a[i];
            a[i]=a[min];
            a[min]=d;
        }
    }
    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
