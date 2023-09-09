import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        float fiyat, kdvOrani, kdv ;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.println("ürünün fiyatını giriniz: ");

        fiyat = input.nextFloat();

        //kdv'yi hesapla

        kdvOrani = (fiyat>0 && fiyat <=1000) ? 0.18f : 0.08f;

        kdv = fiyat * kdvOrani;

        //sonuçları ekrana yazdır

        System.out.println("KDV'siz fiyat: " + fiyat);

        System.out.println("KDV oranı: %" + (kdvOrani*100));

        System.out.println("KDV tutarı: " + kdv);

        System.out.println("KDV'li fiyat: " + (kdv + fiyat));

    }
}