import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        byte ay, gun;
        String burc = "";
        boolean hata = false;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("kaçıncı ayda doğdunuz?");

        ay = input.nextByte();

        System.out.println("ayın kaçıncı gününde doğdunuz?");

        gun = input.nextByte();

        if (ay==1) {

            if ((gun > 0) && (gun <= 21)) {

                burc = "oğlak";

            } else if ( (gun>21) && (gun <= 31) ) {

                burc = "kova";

            } else {

                hata = true;

            }

        }

        if (ay==2) {

            if ((gun > 0) && (gun <= 19)) {

                burc = "kova";

            } else if ( (gun>19) && (gun <= 29) ) {

                burc = "balık";

            } else {

                hata = true;

            }

        }

        if (ay==3) {

            if ((gun > 0) && (gun <= 20)) {

                burc = "balık";

            } else if ( (gun>20) && (gun <= 31) ) {

                burc = "koç";

            } else {

                hata = true;

            }

        }

        if (ay==4) {

            if ((gun > 0) && (gun <= 20)) {

                burc = "koç";

            } else if ( (gun>20) && (gun <= 30) ) {

                burc = "boğa";

            } else {

                hata = true;

            }

        }

        if (ay==5) {

            if ((gun > 0) && (gun <= 21)) {

                burc = "boğa";

            } else if ( (gun>21) && (gun <= 31) ) {

                burc = "ikizler";

            } else {

                hata = true;

            }

        }

        if (ay==6) {

            if ((gun > 0) && (gun <= 22)) {

                burc = "ikizler";

            } else if ( (gun>22) && (gun <= 30) ) {

                burc = "yengeç";

            } else {

                hata = true;

            }

        }

        if (ay==7) {

            if ( (gun > 0) && (gun <= 22) ) {

                burc = "yengeç";

            } else if ( (gun>22) && (gun <= 31) ) {

                burc = "aslan";

            } else {

                hata = true;

            }

        }

        if (ay==8) {

            if ((gun > 0) && (gun <= 22)) {

                burc = "aslan";

            } else if ( (gun>22) && (gun <= 31) ) {

                burc = "başak";

            } else {

                hata = true;

            }

        }

        if (ay==9) {

            if ((gun > 0) && (gun <= 22)) {

                burc = "başak";

            } else if ( (gun>22) && (gun <= 30) ) {

                burc = "terazi";

            } else {

                hata = true;

            }

        }

        if (ay==10) {

            if ((gun > 0) && (gun <= 22)) {

                burc = "terazi";

            } else if ( (gun>22) && (gun <= 31) ) {

                burc = "akrep";

            } else {

                hata = true;

            }

        }

        if (ay==11) {

            if ((gun > 0) && (gun <= 21)) {

                burc = "akrep";

            } else if ( (gun>21) && (gun <= 30) ) {

                burc = "yay";

            } else {

                hata = true;

            }

        }

        if (ay==12) {

            if ((gun > 0) && (gun <= 21)) {

                burc = "yay";

            } else if ( (gun>21) && (gun <= 31) ) {

                burc = "oğlak";

            } else {

                hata = true;

            }

        }

        if (ay<0 || ay>12) {

            hata = true;

        }


        if (hata) {

            System.out.println("hatalı bir giriş yaptınız.");

        }

        else {

            System.out.println("burcunuz: "+burc);

        }

    }

}