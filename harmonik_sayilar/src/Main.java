import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("n sayısını giriniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        double i = 1;
        double sonuc = 0;

        while (i<=n) {

            sonuc += (1/i);
            i++;

        }

        System.out.print("1'den n'e kadar olan harmonik serinin toplamı "+sonuc);

    }

}