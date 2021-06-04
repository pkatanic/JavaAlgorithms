package MyQueue;

public class SimpleQueueTest {
    public static void main(String[] varg) {
            SimpleQueue s = new SimpleQueue();
            work: while(true){
                System.out.print("\n1. Input data\n" +
                                       "2. Get data\n" +
                                       "3. Print elements\n" +
                                       "4. Empty queue\n" +
                                       "0. End \n\n" +
                                       "Your choice? ");
                switch(Read.Int()){
                    case 1: System.out.print("Number?");
                        s.put(Read.Int());
                        break;
                    case 2: if (!s.IsEmpty())
                        System.out.println("Number= " + s.take());
                    else System.out.println("*** Queue is empty!");
                        break;
                    case 3: System.out.println  ("Queue=       " + s); break;
                    case 4: s.empting(); break;
                    case 0: break work;
                    default: System.out.println ("*** Wrong choice!");

                }
            }
    }
}
