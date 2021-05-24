package Task6;

public class InsertionSort {
    static final int SIZE = 400;
    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] intArray = new int[SIZE];

        fill(intArray);
        print(intArray);
        insertionSort(intArray);

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
    public static void insertionSort(int a[]) {

        int n = a.length;
        for (int i = 0; i < n; i++)
            for(int j=i-1; j>=0&& a[j]>a[j+1]; j--)
            {
                int b=a[j];
                a[j]=a[j+1];
                a[j+1]=b;
            }

    }
    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
