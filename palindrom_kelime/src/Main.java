import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String kelime;

        do {

            System.out.println("bir kelime giriniz. (çıkış için 0 giriniz)");
            kelime = input.nextLine();

            if ( (palindromMu(kelime)) && (!kelime.equals("0")) ) {

                System.out.println("girilen kelime palindromiktir.");

            }

            else if (!kelime.equals("0")) {

                System.out.println("girilen kelime palindromik değildir.");

            }

            else

                System.out.println("çıkış yaptınız.");


        }

        while (!kelime.equals("0"));

    }

    static boolean palindromMu (String kelime) {

        String ters = "";

        for (int i = kelime.length()-1;i>=0;i--) {

            ters += kelime.charAt(i);

        }

        if (kelime.equals(ters)) {

            return true;

        }

        else {

            return false;

        }

    }



}