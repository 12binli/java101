import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("sınır sayısını giriniz : ");

        n = input.nextInt();

        //sonucu ekrana yazdır.

        System.out.println("4'ün kuvvetleri:");

        for (int i = 1 ; i<=n ; i*=4) {

            System.out.println(i);

        }

        System.out.println("\n5'in kuvvetleri:");

        for(int j=1 ; j<=n ; j*=5) {

            System.out.println(j);

        }

    }

}