import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur

        float a, b, c;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("ilk sayıyı giriniz.");

        a = input.nextFloat();

        System.out.println("ikinci sayıyı giriniz.");

        b = input.nextFloat();

        System.out.println("üçüncü sayıyı giriniz.");

        c = input.nextFloat();

        if ( (a < b) && (a < c) ) {

            if (b<c) {

                System.out.println("a < b < c");

            }

            else if (c<b) {

                System.out.println("a < c < b");

            }

            else {

                System.out.println("a < b = c");

            }

        }

        else if ( (b < a) && (b < c) ) {

            if (a<c) {

                System.out.println("b < a < c");

            }

            else if (c<a) {

                System.out.println("b < c < a");

            }

            else {

                System.out.println("b < a = c");

            }

        }

        else if ( (c < a) && (c < b) ) {

            if (a<b) {

                System.out.println("c < a < b");

            }

            else if (b<a) {

                System.out.println("c < b < a");

            }

            else {

                System.out.println("c < b = a");

            }

        }

        else if ( (a==b) && (b==c) ) {

            System.out.println("a = b = c");

        }

        else if ( (b==c) && (a>b) ) {

            System.out.println("b = c < a");

        }

        else if ( (a==c) && (b>a) ) {

            System.out.println("a = c < b");

        }

        else if ( (a==b) && (c>a) ) {

            System.out.println("a = b < c");

        }

        else {

            System.out.println("bir sıkıntı yaşandı.");

        }

    }

}