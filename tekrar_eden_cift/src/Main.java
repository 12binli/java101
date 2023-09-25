import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int boyut;

        Scanner input = new Scanner(System.in);

        System.out.println("dizinin boyutunu giriniz.");

        boyut = input.nextInt();

        int[] dizi = new int[boyut];

        for (int i=0 ; i < boyut ; i++) {

            System.out.println(i+1 + ". dizi elemanını giriniz.");

            dizi[i] = input.nextInt();

        }

        //12 2 2 4 6 8 10 12 14 16 18 18 16

        System.out.println(Dizi.yazdir(Dizi.tekrarEden(dizi)));

    }
}