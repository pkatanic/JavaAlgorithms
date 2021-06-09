package recursiveStackCall;

public class SimulateRecursion {
    public static void main(String[] args) {
        System.out.println(faktorijelS(5));
    }
    static int faktorijelS(int n){
        Stek<Integer> s = new Stek<Integer>(100);

        while(n>1){
            s.put(n);
            n--;
        }
        int rez = 1;

        while(!s.isEmpty()){
            n = s.takeOffTop();
            rez = rez*n;
        }
        return rez;
    }
}
