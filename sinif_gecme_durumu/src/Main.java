import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // değişkenleri oluştur.

        int mat, fiz, tur, kim, muz, sayi = 0;

        float ort = 0f;

        // Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al.

        System.out.println("matematik notunu giriniz: ");

        mat = input.nextInt();

        System.out.println("fizik notunu giriniz: ");

        fiz = input.nextInt();

        System.out.println("türkçe notunu giriniz: ");

        tur = input.nextInt();

        System.out.println("kimya notunu giriniz: ");

        kim = input.nextInt();

        System.out.println("müzik notunu giriniz: ");

        muz = input.nextInt();

        //

        if ( (mat>=0) && (mat<=100) ) {

            ort += mat;
            sayi++;

        }
        if ( (fiz>=0) && (fiz<=100) ) {

            ort += fiz;
            sayi++;

        }
        if ( (tur>=0) && (tur<=100) ) {

            ort += tur;
            sayi++;

        }
        if ( (kim>=0) && (kim<=100) ) {

            ort += kim;
            sayi++;

        }
        if ( (muz>=0) && (muz<=100) ) {

            ort += muz;
            sayi++;

        }

        if ( sayi >= 1) {

            if ((ort / sayi) >= 55) {

                System.out.println("sınıfı geçtiniz.\n" + "ortalamanız: " + (ort / sayi));

            } else if ((ort / sayi) < 55) {

                System.out.println("sınıfta kaldınız.\n" + "ortalamanız: " + (ort / sayi));

            }

        }

        if ( sayi == 5) {

        }

        else if ( sayi >=1 && sayi <5 ) {

            System.out.println("en az bir not doğru aralıkta girilmedi. aralıkta olmayan notlar ortalamaya dahil edilmedi.");

        }

        else {

            System.out.println("tüm notlar aralığın dışında girildi.");

        }

    }

}