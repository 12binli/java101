import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n1, n2;

        byte islem;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("1. değeri giriniz: ");

        n1 = input.nextInt();

        System.out.print("2. değeri giriniz: ");

        n2 = input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");

        System.out.print("yapmak istediğiniz işlemi seçiniz: ");

        islem = input.nextByte();

        switch (islem) {

            case 1:
                System.out.print("iki sayının toplamı: " + (n1+n2));
                break;
            case 2:
                System.out.print("iki sayının farkı: " + (n1-n2));
                break;
            case 3:
                System.out.print("iki sayının çarpımı: " + (n1*n2));
                break;
            case 4:

                switch (n2) {

                    case (0):
                        System.out.println("bir sayı 0'a bölünemez.");
                        break;

                    default:

                        System.out.print("iki sayının bölümü: " + (n1/n2));

                }
                break;
            default:
                System.out.print("1-4 arasında bir sayı girmediniz.");

        }

    }

}