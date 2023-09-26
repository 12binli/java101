import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int boyut;

        Scanner input = new Scanner(System.in);

        System.out.println("dizinin boyutunu giriniz.");

        boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i = 0; i < boyut; i++) {

            System.out.println(i + 1 + ". dizi elemanını giriniz.");

            dizi[i] = input.nextInt();

        }

        //5 99 -2 -2121 1 0
        //6 1000221 22 -1 999 0 254

        Dizi.sirala(dizi);

        System.out.println(Dizi.yazdir(dizi));

    }

}