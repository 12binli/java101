public class Main {

    public static void main(String[] args) {

        int sayi=0;

        for (int i= 1; i<=100; i++) {

            for (int j=1; j<=i; j++) {

                if (i%j == 0) {

                    sayi +=1;

                }

            }

            if (sayi==2) {

                System.out.print(i+" ");

            }

            sayi=0;

        }

    }

}