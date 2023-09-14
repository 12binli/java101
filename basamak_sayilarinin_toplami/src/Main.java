import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n,bd, sonuc=0;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("sayı giriniz : ");

        n = input.nextInt();

        int gn = n;

        //sonucu ekrana yazdır.

        while (gn !=0) {

            bd = gn % 10;

            sonuc+=bd;

            gn/=10;

        }

        System.out.print(n+" sayısının basamak sayılarının toplamı : "+sonuc);

    }

}