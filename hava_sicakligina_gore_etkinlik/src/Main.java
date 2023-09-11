import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        byte sicaklik;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.print("hava sıcaklığını giriniz : ");

        sicaklik = input.nextByte();

        if (sicaklik < 5) {

            System.out.println("kayak yapmaya gidebilirsin.");

        }

        else if (sicaklik <= 10) {

            System.out.println("sinemaya gidebilirsin.");

        }

        else if (sicaklik<=15) {

            System.out.println("sinemaya gidebilirsin.");

            System.out.println("pikniğe gidebilirsin.");

        }

        else if (sicaklik<=25) {

            System.out.println("pikniğe gidebilirsin.");

        }

        else {

            System.out.println("yüzmeye gidebilirsin.");

        }


    }

}