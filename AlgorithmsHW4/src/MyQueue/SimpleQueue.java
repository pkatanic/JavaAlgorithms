package MyQueue;

public class SimpleQueue {
    private Elem first, last;

    public void put(int number){
        Elem newEl = new Elem(number);
        if(first == null)
            first=newEl;
        else last.next = newEl;
    }
    public int take(){
        if(first == null){
            System.out.println("n*** Queue is empty ***\n");
            System.exit(1);
        }
        int b = first.number;
        if((first = first.next) == null) last=null;
        return b;
    }
    public void empting(){
        first = last = null;
    }
    public boolean IsEmpty(){
        return first == null;
    }
    public String toString(){
        String s = "";
        for(Elem curr=first; curr!=null; curr=curr.next)
            s += curr.number + " ";
        return s;
    }
}
