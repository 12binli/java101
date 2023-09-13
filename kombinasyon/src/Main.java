import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n,r, f1=1, f2=1, f3=1;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan veriyi al.

        System.out.print("n sayısını giriniz : ");

        n = input.nextInt();

        System.out.print("r sayısını giriniz : ");

        r= input.nextInt();

        //sonucu ekrana yazdır.

        for (int i = 1; i <=n; i++) {

            f1 *= i;

        }

        for (int j = 1; j <=r; j++) {

            f2 *= j;

        }

        for (int k = 1; k <= (n-r); k++) {

            f3 *= k;

        }

        System.out.println("n'nin r'li kombinasyonu : "+( f1 / (f2 * f3) ));

    }

}