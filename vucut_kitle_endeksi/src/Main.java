import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        float boy, kilo;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");

        boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz : ");

        kilo = input.nextFloat();

        //sonucu ekrana yazdır.

        System.out.println("Vücut Kitle İndeksiniz : "+kilo/(boy*boy));

    }

}