import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur

        float r, pi=3.14f, a;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("dairenin yarıçapını giriniz:");

        r= input.nextFloat();

        System.out.println("merkez açının derecesini giriniz:");

        a= input.nextFloat();

        //sonuçları ekrana yazdır.

        System.out.println("Dairenin alanı: "+(pi*r*r));

        System.out.println("Dairenin çevresi: "+(2*pi*r));

        System.out.println("Daire diliminin alanı: "+(pi*r*r*a/360));

    }


}