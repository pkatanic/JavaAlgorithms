package recursiveStackCall;

public class Stek<T>{

    public static final String SEPARATOR = ", ";

    private int full;

    private T[] elements;

    public static final int DEFAULT_SIZE= 100;

    public Stek(){
        this(DEFAULT_SIZE);
    }

    @SuppressWarnings("unchecked")
    public Stek(int n){
        full = 0;
        elements = (T[]) (new Object[n]);
    }


    public boolean isEmpty(){
        return full == 0;
    }


    public boolean isFull(){
        return full == elements.length;
    }



    public T top(){
        if(isEmpty()){
            throw new IllegalStateException("Стек пустой");
        }
        else{
            return elements[full-1];
        }
    }


    public T takeOffTop(){
        if(isEmpty()){
            throw new IllegalStateException("Стек пустой");
        }
        else{
            full--;
        }
        return elements[full];
    }


    public void put(T x){
        if(isFull()){
            throw new IllegalStateException("Стек заполнен");
        }
        else{
            elements[full] = x;
            full++;
        }
    }

    public String toString(){
        String rez = "Стек: ";
        if(isEmpty()){
            rez += "пустой";
        }
        else{
            rez += elements[full-1];
            if(full > 1){
                int next = full - 2;
                rez += SEPARATOR + elements[next];
                if(full > 2){
                    if(full > 4){
                        rez += SEPARATOR + "...";
                    }
                    if(full > 3){
                        rez += SEPARATOR + elements[1];
                    }
                    rez += SEPARATOR + elements[0];
                }
            }
        }
        return rez;
    }
}
