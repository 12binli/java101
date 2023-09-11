import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        //değişkenleri oluştur.

        String kullaniciAdi, sifre ;

        // Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.println("kullanıcı adınız: ");

        kullaniciAdi = input.nextLine();

        System.out.println("şifreniz: ");

        sifre = input.nextLine();

        //

        if ((kullaniciAdi.equals("patika")) && (sifre.equals("java123"))) {

            System.out.println("giriş yaptınız.");

        }

        else {

                System.out.println("kullanıcı adı veya şifre yanlış.");

                System.out.println("şifrenizi yenilemek ister misiniz? evet ya da hayır.");

                String karar = input.nextLine();

                if ( (karar.equals("evet")) ) {

                System.out.println("kullanıcı adınızı giriniz: ");

                kullaniciAdi = input.nextLine();

                    if ( (kullaniciAdi.equals("patika")) ) {

                        System.out.println("yeni şifreyi giriniz.");

                        String yenisifre = input.nextLine();

                        if ( ( (yenisifre.equals(sifre)) ) || ( (yenisifre.equals("java123")) ) ) {

                            System.out.println("şifreniz oluşturulamadı lütfen başka bir şifre giriniz.");

                        }

                        else {

                            System.out.println("yeni şifreniz oluşturulmuştur.");

                        }


                    }

                    else {

                        System.out.println("kullanıcı adını yanlış girdiniz");

                    }

                }

                else if ( (karar.equals("hayır")) ) {

                    System.out.println("şifreniz yenilenmedi.");

                }

                else {

                    System.out.println("yanlış bir giriş yaptınız.");

                }

        }

    }

}