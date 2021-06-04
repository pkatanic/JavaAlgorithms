package LinkedListStack;

public class Main {
    public static void main(String[] args) {
        LinkedStack s = new LinkedStack();

        long start = System.nanoTime();

        System.out.println("Stack is empty: "+ s.isEmpty());

        //Push Data onto Stack
        for(int i = 0; i< 1000; i++)
        {
            s.push(i*3);
            s.displayStack(System.out);
        }

        System.out.println("------------------------");
        System.out.print("(Size: "+s.size() +") "); s.displayStack(System.out);
        System.out.println("------------------------");

        //Pop Data off Stack
        for(int i = 0; i< 1000; i++)
        {
            s.pop();
            s.displayStack(System.out);
        }

        System.out.println("Stack is empty: "+ s.isEmpty());
        long end = System.nanoTime();
        long elapsedTime = end - start;
        System.out.println("Time spent: " + elapsedTime + " nanoseconds");
    }
}
