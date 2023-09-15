import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        String kullaniciAdi, sifre;

        int hak= 3;

        int bakiye= 1500;

        int secim;

        int miktar;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        while (hak>0) {

            System.out.println("kullanıcı adınızı giriniz.");

            kullaniciAdi = input.nextLine();

            System.out.println("şifrenizi giriniz.");

            sifre = input.nextLine();


            if ((kullaniciAdi.equals("patika")) && (sifre.equals("dev123"))) {

                System.out.println("merhaba, kodluyoruz bankasına hoş geldininiz!");

                do {

                    System.out.println("1- para yatırma\n" +
                            "2- para-cekme\n" +
                            "3- bakiye sorgulama\n" +
                            "4- çıkış yap");

                    System.out.print("yapmak istediğiniz işlemi seçiniz : ");

                    secim = input.nextInt();

                    switch (secim) {

                        case 1:

                            System.out.print("para miktarı : ");

                            miktar = input.nextInt();

                            bakiye += miktar;

                            break;

                        case 2:

                            System.out.print("para miktarı : ");

                            miktar = input.nextInt();

                            if (miktar > bakiye) {

                                System.out.println("bakiye yetersiz.");

                            } else {

                                bakiye -= miktar;

                            }

                            break;

                        case 3:

                            System.out.println("bakiyeniz : " + bakiye);

                            break;

                    }

                }

                while (secim != 4);

                System.out.println("tekrar görüşmek üzere.");

                break;

            }

            else {

                hak--;

                System.out.println("hatalı kullanıcı adı veya şifre. tekrar deneyiniz.");

                if (hak == 0) {

                    System.out.println("hesabınız bloke olmuştur banka ile iletişime geçiniz.");

                }

                else {

                    System.out.println("kalan hakkınız : " + hak);

                }

            }

        }

    }

}