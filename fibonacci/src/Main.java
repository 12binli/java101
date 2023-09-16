import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n, a=0,b=1,c=0;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("sayı giriniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        for (int i=1; i<=n-1; i++) {

            if (i%2==1) {

                System.out.println(a + " + " + b + " = " + (a + b));

                c = a + b;
                a = b;


            }

            else {

                System.out.println(a + " + " + c + " = " + (a + c));

                b = a + c;
                a = c;


            }

            System.out.println();

        }

    }

}