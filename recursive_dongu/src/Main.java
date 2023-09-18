import java.util.Scanner;

public class Main {

    static void dongu(int n,int a) {

        System.out.print(n+" ");

        if (n<=0) {

            dongu2(n+5,a);

        }

        else {

            dongu(n-5,a);

        }

    }

    static void dongu2(int n,int a) {

        System.out.print(n+" ");

        if (n<a) {

        dongu2(n+5,a);

        }

    }

    public static void main(String[] args) {

       int n;

       Scanner input = new Scanner(System.in);

       System.out.print("n sayısını giriniz : ");

       n = input.nextInt();

       dongu(n,n);

    }

}