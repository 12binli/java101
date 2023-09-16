import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int t;
        long n;

        Scanner input = new Scanner(System.in);

        t = input.nextInt();

        for (int i=0; i<t; i++) {

            n = input.nextLong();

            System.out.println(n+" can be fitted in:");

            if ( (n>=-128) && (n<=127) ) {

                System.out.println("* byte");

            }

            if ( (n>=-32768) && (n<=32767) ) {

                System.out.println("* short");

            }

            if ( (n>=-2147483648) && (n<=2147483647) ) {

                System.out.println("* int");

            }

            if ( (n>=-9223372036854775808L) && (n<=9223372036854775807L) ) {

                System.out.println("* long");

            }



        }

    }

}