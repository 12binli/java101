import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int a,b,c=1;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("üssü alınacak sayı : ");

        a= input.nextInt();

        System.out.print("üs olacak sayı : ");

        b= input.nextInt();

        //sonucu ekrana yazdır.

        for (int i=1; i<=b; i++) {

            c*=a;

        }

        System.out.print("sonuc : "+c);

    }

}