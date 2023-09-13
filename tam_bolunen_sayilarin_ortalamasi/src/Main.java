import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkeleri oluştur.

        int a, b= 0, c=0;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("sayı giriniz : ");

        a = input.nextInt();

        //sonucu ekrana yazdır.

        for (int i = 1; i <= a; i++) {

            if ( ( (i % 3) == 0) && ( (i % 4) == 0) ) {

                b++;
                c+=i;

            }

        }

        if (b>0) {

            System.out.println("0'dan girilen sayıya kadar 3'e ve 4'e tam bölünen sayıların ortalaması : " + (c / b));

        }

        else {

            System.out.println("girdiğiniz sayıya kadar 12'ye bölünen bir sayı yok.");

        }

    }

}