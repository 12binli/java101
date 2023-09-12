import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int yil;
        boolean artik = false;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("yıl giriniz : ");

        yil = input.nextInt();

        //sonucu ekrana yazdır.

        if ( (yil%4) == 0) {

            artik = true;

            if (yil%100==0) {

                if (yil%400==0) {

                    artik = true;

                }

                else {

                    artik = false;

                }

            }

        }

        if (artik) {

            System.out.println(yil+" bir artık yıldır.");

        }

        else {

            System.out.println(yil+" bir artık yıl değildir.");

        }

    }

}