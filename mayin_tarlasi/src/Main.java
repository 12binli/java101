import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int satir, sutun, secSatir, secSutun, kedildi=0;

        System.out.println("lütfen oyun alanının satır büyüklüğünü giriniz.");

        satir = input.nextInt();

        System.out.println("lütfen oyun alanının sütun büyüklüğünü giriniz.");

        sutun = input.nextInt();

        MayinTarlasi mayinTarlasi = new MayinTarlasi(satir,sutun);

        mayinTarlasi.rastgeleMayinEkle(satir,sutun);

        mayinTarlasi.haritaYazdir();

        do {

            System.out.println("lütfen oynanacak satırı giriniz.");
            secSatir = input.nextInt();
            System.out.println("lütfen oynanacak sütunu giriniz.");
            secSutun = input.nextInt();

            if (mayinTarlasi.kontrolMu(secSatir,secSutun)) {

                System.out.println("bu hücre kontrol edildi lütfen tekrar deneyiniz!");
                continue;
            }
            else {

                kedildi++;

            }

            if (mayinTarlasi.patladiMi(secSatir,secSutun)) {

                System.out.println("mayın patladı!!!");

            }

            else {

                mayinTarlasi.mayinKontrol(secSatir,secSutun);
                mayinTarlasi.haritaYazdir();

            }

            if (kedildi == (satir*sutun*3/4)) {

                System.out.println("oyunu kazandınız. tebrikler!");
                break;

            }

        }

        while (!mayinTarlasi.patladiMi(secSatir,secSutun));


    }
}