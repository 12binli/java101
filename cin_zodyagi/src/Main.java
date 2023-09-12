import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int yil;

        String zodyak = "";

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.println("hangi yılda doğdunuz?");

        yil = input.nextInt();

        switch (yil%12) {

            case 0:

                zodyak = "maymun";

                break;

            case 1:

                zodyak = "horoz";

                break;

            case 2:

                zodyak = "köpek";

                break;

            case 3:

                zodyak = "domuz";

                break;

            case 4:

                zodyak = "fare";

                break;

            case 5:

                zodyak = "öküz";

                break;

            case 6:

                zodyak = "kaplan";

                break;

            case 7:

                zodyak = "tavşan";

                break;

            case 8:

                zodyak = "ejderha";

                break;

            case 9:

                zodyak = "yılan";

                break;

            case 10:

                zodyak = "at";

                break;

            case 11:

                zodyak = "koyun";

                break;

        }

        if (yil<0) {

            System.out.println("hatalı giriş yaptınız.");

        }

        else {

            System.out.println("çin zodyağı burcunuz : " + zodyak);

        }

    }

}