package recursionExample;

import java.util.Scanner;

public class RecursiveFactorial {
    public static long factorial(long x) {
        if(x<0) throw new IllegalArgumentException("x должен быть >0");
        if(x<=1) return 1;    //здесь рекурсия прекращается
        else return x*factorial(x-1);  // вызов самого себя
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Внесите число: ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
       /* if (n < 0)
            System.out.println("Число должно быть больше 0.");
        else
        {
            System.out.println(factorial(n));
        }*/
        System.out.println(factorial(n));

    }

}
