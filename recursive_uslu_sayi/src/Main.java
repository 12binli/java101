import java.util.Scanner;

public class Main {

    static int us(int taban,int us) {

        if (us==0) {

            return 1;

        }

        return taban*(us(taban,us-1));

    }

    public static void main (String[] args) {

        int taban, us;

        Scanner input = new Scanner(System.in);

        System.out.print("taban değerini giriniz : ");

        taban = input.nextInt();

        System.out.print("üs değerini giriniz : ");

        us = input.nextInt();

        System.out.println(taban+" ^ " + us + " = " + us(taban,us) );

    }

}