import java.util.Scanner;

public class Main {

    static int fib(int n) {

        if (n==1) {

            return 0;

        }
        else if (n==2) {

            return 1;

        }

        else {

            return fib(n-1)+fib(n-2);

        }

    }

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("n sayısını giriniz:");

        n = input.nextInt();

        System.out.println(n+" haneli fibonacci serisi:");

        for (int i=1; i<=n; i++) {

            System.out.print(fib(i)+" ");

        }

    }

}