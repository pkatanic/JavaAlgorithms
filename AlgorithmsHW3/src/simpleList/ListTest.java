package simpleList;

public class ListTest {
    public static void main(String[] args) {
        Lista lst = new Lista();
        work: while(true){
            System.out.print("\n1. Adding number at the beginning of the list\n"      +
                    "2. Adding number at the end of the list\n"         +
                    "3. Insert number in ordered list\n"       +
                    "4. Omit number from the list\n"          +
                    "5. Emty list\n"         +
                    "6. Read elements and reverse order of elements\n" +
                    "7. Read elements and keep  order of elements\n"  +
                    "8. Getting length of the list\n"             +
                    "9. Write list\n"                     +
                    "0. End of work\n\n"                      +
                    "Your choice? "
            );
            int choice = Read.Int();
            switch(choice){
                case 1: case 2: case 3: case 4:
                    System.out.print("Number?      "); int number = Read.Int();
                    switch (choice) {
                        case 1:
                            long start = System.nanoTime();

                            lst.addToBegin(number);
                            long end = System.nanoTime();
                            long elapsedTime = end - start;
                            double seconds = (double)elapsedTime / 1_000_000_000.0;
                            System.out.println((seconds) + " seconds");
                            break;
                        case 2:
                            long start2 = System.nanoTime();
                            lst.addToEnd(number);
                            long end2 = System.nanoTime();
                            long elapsedTime2 = end2 - start2;
                            double seconds2 = (double)elapsedTime2 / 1_000_000_000.0;
                            System.out.println((seconds2) + " seconds");
                            break;
                        case 3:
                            lst.insert(number);    break;
                        case 4:
                            long start3 = System.nanoTime();
                            lst.remove(number);
                            long end3 = System.nanoTime();
                            long elapsedTime3 = end3 - start3;
                            double seconds3 = (double)elapsedTime3 / 1_000_000_000.0;
                            System.out.println((seconds3) + " seconds");
                            break;
                    } break;
                case 5: // Empty list
                    lst.empty(); break;
                case 6: case 7:
                    System.out.print("Length?    "); int n = Read.Int();
                    System.out.print("Elements?  ");
                    switch (choice) {
                        case 6: // ... reverse order of elements:
                            lst.read1(n); break;
                        case 7: // ... keep order of elements:
                            lst.read2(n); break;
                    } break;

                case 8: // Get the length of list
                    System.out.println("Length=    " + lst.numElOfList()); break;
                case 9: // Print list
                    System.out.println("List=     " + lst); break;
                case 0: //End of the work
                    break work;
                default:// Wrong choice:
                    System.out.println("*** Your choice is wrong! ***"); break;
            }

        }
    }
}
