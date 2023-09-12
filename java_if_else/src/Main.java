import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //degiskenleri olustur.

        int n;

        //Scanner sinifini tanimla.

        Scanner input = new Scanner(System.in);

        //kullanicidan degeri al.

        n = input.nextInt();

        //kosullar

        if (n>=1 && n<=100) {

            if ((n % 2) == 1) {

                System.out.println("Weird");

            }

            else if (n <= 5) {

                System.out.println("Not Weird");

            }

            else if (n <= 20) {

                System.out.println("Weird");

            }

            else {

                System.out.println("Not Weird");

            }

        }

        //hata

        else {

            System.out.println("number is not in range 1<=n<=100");

        }

    }

}