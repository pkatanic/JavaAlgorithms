package simpleList;

public class Elem {
    public int number;
    public Elem next;
    public Elem(int b, Elem n)
    {
        number = b; next =n;
    }
    public Elem(int n) {
        number = n;
    }
}
