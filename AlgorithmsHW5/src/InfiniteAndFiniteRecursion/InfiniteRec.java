package InfiniteAndFiniteRecursion;

public class InfiniteRec {
    static void p(){
        System.out.println("hello");
        p();
    }
    public static void main(String[] args) {
        p();
    }
}
