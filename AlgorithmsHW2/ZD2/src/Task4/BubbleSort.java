package Task4;

public class BubbleSort {
    static final int SIZE = 400;
    public static void main(String[] args) {

        long start = System.nanoTime();
        int[] intArray = new int[SIZE];

        fill(intArray);
        print(intArray);
        sort(intArray);

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
    public static int[] sort(int[] array){
        boolean changed;
        do{
            changed = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    changed = true;
                }
            }
        } while(changed);
        return array;
    }
    public static void print(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
