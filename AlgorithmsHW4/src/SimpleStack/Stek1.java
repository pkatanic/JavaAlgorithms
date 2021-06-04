package SimpleStack;

public class Stek1 {
    private int[] array;
    private int top=0;

    public Stek1() {
        array = new int[10];
    }

    public Stek1(int k) {
        array = new int [k];
    }
    public void put(int k){
        if(top == array.length){
            System.out.println("\n***Stack is full ***\n");
            System.exit(1);
        }
        array[top++]=k;
    }
    public int take(){
        if(top == 0) {
            System.out.println("\n*** Stack is empty ***\n");
        }
        return array[--top];
    }
    public void emptying(){
        top=0;
    }
    public boolean empty(){
       return top ==0;
    }
    public boolean full(){
        return top == array.length;
    }
    public String toString() {
        String s = "";
        for(int i = top; i>0; s+=array[--i] + " ");
        return s;
    }
}
