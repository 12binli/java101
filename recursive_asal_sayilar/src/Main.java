import java.util.Scanner;

public class Main {

    static boolean asal(int n,int i ) {

        if (n<=2) {

            return (n==2);

        }

        if (i==1) {

            return true;

        }

        if (n%i==0) {

            return false;

        }


            return asal(n, i-1);

    }

    public static void main(String[] args) {

        int n;

        do {

            Scanner input = new Scanner(System.in);

            System.out.print("0- çıkış\nsayı giriniz : ");

            n = input.nextInt();

            if (n==0) {

            }

            else {

                if (asal(n,n-1)) {

                    System.out.println(n+" sayısı asaldır.");

                }

                else {

                    System.out.println(n+" sayısı asal değildir.");

                }

            }

        }

        while (n!=0);

        System.out.println("çıkış yaptınız.");

    }

}