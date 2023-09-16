import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n;

        //scanner sınfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("bir sayı giriniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        for (int i = 1; i <= n; i++ ) {

            for (int j = 1; j < i; j++ ) {

                System.out.print(" ");

            }

            for (int k = 0 ; k <= 2*(n-i); k++) {

                System.out.print("*");

            }

            System.out.println();

        }


    }

}