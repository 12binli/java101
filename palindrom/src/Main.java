import java.util.Scanner;

public class Main {

    static boolean palindrom (int sayi) {

        int gecici=sayi, sonsayi, ters=0;

        while (gecici!=0) {

            sonsayi = gecici % 10;

            ters = (ters*10) + sonsayi;

            gecici /=10;

        }

        return (sayi==ters);

    }

    public static void main(String[] args) {

        //değişkenleri oluştur

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.println("sayı giriniz:");

        int sayi = input.nextInt();

        //sonucu ekrana yazdır.

        String durum = palindrom(sayi) ? "palindrom sayıdır." : "palindrom sayı değildir.";

        System.out.println(durum);

    }

}