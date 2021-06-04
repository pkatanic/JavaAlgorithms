package MyQueue;

public class Elem {
    public int number;
    public Elem next;
    public Elem(int b, Elem s)
    { number = b; next = s; }
    public Elem(int b) { number = b; }
}
