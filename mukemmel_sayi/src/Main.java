import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n, toplam=0;

        //scanner sınfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("bir sayı giriniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        for (int i = 1; i<=n-1; i++) {

            toplam = (n%i) == 0 ? toplam+=i : toplam;

        }

        String karar = (n==toplam) ? (" mükemmel sayıdır.") : (" mükemmel sayı değildir.");

        System.out.println(n+karar);

    }

}