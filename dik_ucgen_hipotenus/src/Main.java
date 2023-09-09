import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        float a, b, c, d, e;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("1. kenarın değerini giriniz: ");

        a = input.nextFloat();

        System.out.println("2. kenarın değerini giriniz: ");

        b = input.nextFloat();

        //hipotenüsü hesapla, üçgenin çevresi ve alanını bul.

        c = (float) Math.sqrt ((a*a)+(b*b));

        d = (a+b+c)/2;

        e = (float) (Math.sqrt ((d)*(d-a)*(d-b)*(d-c)));


        //sonuçları ekrana yazdır.

        System.out.println("Hipotenüsün değeri: "+c+"'dir.");

        System.out.println("Üçgenin çevresi: "+2*d+"'dir.");

        System.out.println("Üçgenin alanı: "+e+"'dir.");

    }
}