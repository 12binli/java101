import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int boyut,sayi;

        Scanner input = new Scanner(System.in);

        System.out.println("dizinin boyutunu giriniz.");

        boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i=0 ; i < boyut ; i++) {

            System.out.println(i+1 + ". dizi elemanını giriniz.");

            dizi[i] = input.nextInt();

        }

        System.out.println("girilen dizi : " + Dizi.yazdir(dizi));

        Dizi.sirala(dizi);

        System.out.println("sıralanmış hali : " + Dizi.yazdir(dizi));

        System.out.println("sayı giriniz.");

        sayi = input.nextInt();

        Dizi.enYakinBuyuk(dizi,sayi);

        Dizi.tersSirala(dizi);

        Dizi.enYakinKucuk(dizi,sayi);

    }

}