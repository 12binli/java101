import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int sayi = (int) (Math.random()*100);
        int tahmin, sayac = 0;
        int[] girilen = new int[5];
        boolean hataMi = false;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("lütfen tahmininizi giriniz.");

            tahmin = input.nextInt();

            if (tahmin<0 || tahmin>99) {

                System.out.println("0 ile 100 arasında bir sayı giriniz.");

                if (hataMi) {

                    sayac++;
                    System.out.println("çok fazla hatalı giriş yaptınız. kalan hakkınız : "
                            +(4-sayac)
                    );

                }
                else {

                    hataMi=true;
                    System.out.println("bir daha hatalı girişinizde hakkınızdan düşülecektir.");

                }

                continue;

            }

            if (tahmin>sayi) {

                System.out.println("daha düşük bir sayı deneyiniz.");

            }

            else if (tahmin==sayi) {

                System.out.println("doğru bildiniz!");

            }

            else {

                System.out.println("daha yüksek bir sayı giriniz.");

            }

            girilen[sayac] = tahmin;

            sayac++;

            if (sayac<5) {

                System.out.println("kalan hakkınız : "+(5-sayac));

            }

        }

        while ( (sayi!=tahmin) && (sayac!=5) );

        if (sayi==tahmin) {

            System.out.println("kazandınız!");
        }
        else {

            System.out.println("kaybettiniz.");

        }

        System.out.println("girdiğiniz sayılar : "+Arrays.toString(girilen));

    }
}