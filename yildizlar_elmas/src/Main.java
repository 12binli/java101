import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("n sayısını giriniz : ");

        n = input.nextInt();

        //ekrana sonucu yazdır.

        for (int i=1; i <=n; i++) {

            for (int j=1; j <= (n-i); j++ ) {

                System.out.print(" ");

            }

            for (int k=1; k <= ( (2*i) -1); k++ ) {

                System.out.print("*");

            }

            System.out.println("");

        }

        for (int a= (n-1) ; a>0; a--) {

            for (int b= 1 ; b < (n+1-a); b++ ) {

                System.out.print(" ");

            }

            for (int c= (2*a-1) ; c>0 ; c-- ) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}