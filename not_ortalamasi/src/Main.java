import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int mat, fiz, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımla.

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("matematik not: ");
        mat = inp.nextInt();

        System.out.print("fizik not: ");
        fiz = inp.nextInt();

        System.out.print("kimya not: ");
        kimya = inp.nextInt();

        System.out.print("türkçe not: ");
        turkce = inp.nextInt();

        System.out.print("tarih not: ");
        tarih = inp.nextInt();

        System.out.print("müzik not: ");
        muzik = inp.nextInt();

        //ortalamayı hesapla

        float ortalama = (mat + fiz + kimya + turkce + tarih + muzik)/6f;

        //durumu hesapla

        String durum = (ortalama > 60) ? "sınıfı geçti." : "sınıfta kaldı.";

        //sonuçları ekrana yazdır

        System.out.println(durum);

        System.out.print("ortalaması: " + ortalama);
    }
}