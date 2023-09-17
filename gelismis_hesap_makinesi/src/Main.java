import java.util.Scanner;

public class Main {

    static int toplama (int n1,int n2) {

        return n1 + n2;

    }

    static int cikarma (int n1,int n2) {

        return n1 - n2;

    }

    static int carpma (int n1,int n2) {

        return n1*n2;

    }

    static void bolme (int n1, int n2) {

        if (n2==0) {

            System.out.println("ikinci sayı 0'dan farklı olmalı.");

        }

        else {

            System.out.println("bölümü : "+(n1/n2));

        }

    }

    static int us (int n1,int n2) {

        int sonuc = 1;

        for(int i=1; i<=n2; i++) {

            sonuc*=n1;

        }

        return sonuc;

    }

    static int mod (int n1,int n2) {

        return n1%n2;

    }

    static void dik (int n1,int n2) {

        System.out.println( "alanı : " + (n1*n2) );

        System.out.println( "çevresi : " + ( 2*(n1+n2) ) );

    }

    public static void main(String[] args) {

        int secim, n1, n2;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("hangi işlemi yapmak istiyorsunuz?\n" +
                    "1- toplama işlemi\n" +
                    "2- çıkarma işlemi\n" +
                    "3- çarpma işlemi\n" +
                    "4- bölme işlemi\n" +
                    "5- üslü sayı hesaplama\n" +
                    "6- mod alma\n" +
                    "7- diktörtgen alan ve çevre hesabı\n" +
                    "0- çıkış yap");

            secim = input.nextInt();

            if (secim == 0) {

                break;

            }

            System.out.print("1. sayıyı giriniz : ");

            n1 = input.nextInt();

            System.out.print("2. sayıyı giriniz : ");

            n2 = input.nextInt();

            switch (secim) {

                case 1:

                    System.out.println("toplamı : " + toplama (n1,n2));

                    break;

                case 2:

                    System.out.println("farkı : " + cikarma(n1,n2));

                    break;

                case 3:

                    System.out.println("çarpımı : " + carpma(n1,n2));

                    break;

                case 4:

                    bolme(n1,n2);

                    break;

                case 5:

                    System.out.println(n1+" üssü "+n2+" = "+ us(n1,n2));

                    break;

                case 6:

                    System.out.println(n1+"'in "+n2+" için modu = "+ mod(n1,n2));

                    break;

                case 7:

                    dik(n1,n2);

                    break;

                default:

                    System.out.println("yanlış seçim yaptınız. tekrar deneyiniz.");

            }

        }

            System.out.println("çıkış yaptınız.");

    }

}