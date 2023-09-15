import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n, max=0, min=0;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("kaç tane sayı gireceksiniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        for (int i=1; i<=n; i++) {

            System.out.println(i+". sayıyı giriniz : ");

            int sayi = input.nextInt();

            if (i==1) {

                max=sayi;
                min=sayi;

            }

            else {

                if (sayi>=max) {

                    max=sayi;

                }

                else if (sayi<=min) {

                    min=sayi;

                }

            }

        }

        if (n>0) {

            System.out.println("en büyük sayı "+max+", en küçük sayı " +min+".");

        }

        else {

            System.out.println("hatalı sayı girdiniz.");

        }

    }

}