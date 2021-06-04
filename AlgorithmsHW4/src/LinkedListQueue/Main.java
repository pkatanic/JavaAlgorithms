package LinkedListQueue;

public class Main {
    public static void main(String[] args) {
        long start = System.nanoTime();

        LLQueue queue = new LLQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time spent: " + elapsedTime + " nanoseconds");


        System.out.print("First peek: " + queue.peek());

        System.out.print("\nFirst dequeue: " + queue.dequeue() + "\nSecond dequeue: " + queue.dequeue() + "\nThird dequeue: " + queue.dequeue());
    }
}
