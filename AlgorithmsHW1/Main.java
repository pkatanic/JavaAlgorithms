import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите действительную и мнимую часть первого комплексного числа c1:");
        Scanner sc =new Scanner(System.in);
        double a1=sc.nextDouble();
        double a2=sc.nextDouble();
        System.out.println("Введите действительную и мнимую часть второго комплексного числа c2:");
        double a11=sc.nextDouble();
        double a22=sc.nextDouble();

        ComplNum c1 = new ComplNum(a1,a2);
        ComplNum c2 = new ComplNum(a11,a22);
        System.out.println("Сумма чисел: ");
        System.out.println("c1 + c2 = " + c1.add(c2));

        System.out.println("Вычитание чисел: ");
        System.out.println("c1 - c2 = " + c1.subt(c2));

        long startTime = System.nanoTime();
        System.out.println(c1.equals(c2)); //false
        double elapsedNanos = (double) (System.nanoTime() - startTime)/1000000;
        System.out.println("\tTime elapsed: " + String.valueOf(elapsedNanos) + " milliseconds\n");





    }
}
