package simpleList;

public class Lista {
    private Elem first;

    public Lista() {
    }
    public Lista(int n)
    {
        first = new Elem(n);
    }
    public void empty()
    {
        first = null;
    }

    public int numElOfList(){
        int n=0;
        for(Elem curr = first; curr!=null; curr=curr.next)
            n++;
        return n;
    }
    public String toString(){
        String s = "";
        for(Elem curr = first; curr!=null; curr=curr.next)
            s+=curr.number + " ";
        return s;
    }
    public void addToBegin(int b) {
        first = new Elem(b, first);
    }
    public void addToEnd(int b){
        Elem newEl= new Elem(b);
        if(first == null)
            first = newEl;
        else{
            Elem tek = first;
            while(tek.next!=null)
                tek = tek.next;
            tek.next=newEl;
        }
    }
    public void read1(int n){
        first=null;
        for(int i = 0; i<n; i++)
            first = new Elem(Read.Int(),first);
    }
    public void read2(int n){
        Elem last = first = null;
        for(int i=0; i<n; i++){
            Elem novi = new Elem(Read.Int());
            if(first == null)
                first=novi;
            else last.next = novi;
            last=novi;
        }
    }
    public void insert(int b){
        Elem curr = first, prev = null;
        while(curr !=null && curr.number < b)
        {
          prev = curr; curr = curr.next;
        }
        Elem novi = new Elem(b,curr);
        if(prev == null) first = novi;
        else prev.next = novi;
    }
    public void remove(int b){
        Elem curr = first, prev = null;
        while(curr!=null)
            if(curr.number!=b){
                prev = curr; curr = curr.next;
            } else {
                curr = curr.next;
                if(prev == null) first=curr;
                else prev.next = curr;
            }


    }
}
