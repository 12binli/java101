import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int km;
        float yas, tip, ucret = 0.1f;
        boolean hata = false;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("mesafeyi km cinsinden giriniz : ");

        km = input.nextInt();

        System.out.print("yaşınızı giriniz : ");

        yas = input.nextFloat();

        System.out.print("yolculuk tipini giriniz (1 => tek yön , 2 => gidiş dönüş) : ");

        tip = input.nextFloat();

        if (km>0) {

            if (yas>0) {

                if (tip>0 && tip<3) {



                }

                else {

                    hata = true;

                }

            }

            else {

                hata = true;
            }

        }

        else {

            hata = true;

        }

        if (hata) {

            System.out.println("hatalı veri girdiniz!");

        }

        else {

            if (yas < 12) {

                yas= 0.5f;

            }

            else if (yas <= 24) {

                yas= 0.1f;

            }

            else if (yas > 65) {

                yas = 0.3f;

            }

            else {

                yas = 0;

            }

            if (tip==2) {

                tip = 0.2f;
                ucret *= 2;

            }

            else {

                tip = 0;

            }

            System.out.println("toplam tutar = "+ (
                    (km*ucret) * (1-yas) * (1-tip)
            ) +"TL");

        }

    }

}