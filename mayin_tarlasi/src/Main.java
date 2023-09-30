import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*

        int satir, sutun;

        System.out.println("lütfen oyun alanının satır büyüklüğünü giriniz.");

        satir = input.nextInt();

        System.out.println("lütfen oyun alanının sütun büyüklüğünü giriniz.");

        sutun = input.nextInt();

         */

        MayinTarlasi mt = new MayinTarlasi(2,2);
        mt.calistir();

    }
}