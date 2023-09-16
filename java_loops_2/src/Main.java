import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //degiskenleri olustur.

        int n, a, b, c, d, toplam, r;

        //scanner sinifini tanimla.

        Scanner input = new Scanner(System.in);

        r = input.nextInt();

        for (int j=0; j<r; j++) {

        a = input.nextInt();

        b = input.nextInt();

        n = input.nextInt();

        toplam = 0;

        c = 1;

            for (int i=0; i<n; i++) {

                if (i==0) {

                    d=c*b;

                    toplam+=d;

                    System.out.print(a+toplam+" ");

                }

                else {

                    c*=2;

                    d=c*b;

                    toplam+=d;

                    System.out.print(a+toplam+" ");

                }

            }

            System.out.println();

        }

    }

}