import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n;
        int toplam=0;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        do {

            System.out.println("sayı giriniz : ");

            n = input.nextInt();

            if ( (n%4) == 0 ) {

                toplam+=n;

            }

        }

        while ( (n%2) == 0 );

        System.out.println("toplam : "+toplam);

    }

}