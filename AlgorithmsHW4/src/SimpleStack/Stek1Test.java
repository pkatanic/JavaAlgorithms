package SimpleStack;

public class Stek1Test {
    public static void main(String[] args) {
        Stek1 s = new Stek1();
        work: while (true){
            System.out.print(
              "\n1. Creating stack \n" +
              "2. Putting data to stack\n" +
                      "3. Get data\n"     +
                      "4. Printing data to console\n" +
                      "5. Empty stack\n"     +
                      "0. End of work\n\n"     +
                      "Your choice? "
            );
            switch (Read.Int()) {
                case 1: System.out.print    ("Capacity? ");
                    s = new Stek1(Read.Int());
                    break;
                case 2: if (!s.full()) {
                    System.out.print  ("Number?      ");
                    s.put(Read.Int());
                } else System.out.println("*** Stack is full ***");
                    break;
                case 3: if (!s.empty())
                    System.out.println("Number=      " + s.take());
                else System.out.println("*** Stack is empty ***");
                    break;
                case 4: System.out.println("Stack=      " + s); break;
                case 5: s.emptying(); break;
                case 0: break work;
                default: System.out.println("*** Choice is not allowed ***");

            }

        }
    }
}
