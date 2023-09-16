import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //degiskenleri olustur.

        int n;

        //scanner sinifini tanimla.

        Scanner input = new Scanner(System.in);

        //kullanicidan degeri al.

        n = input.nextInt();

        //sonucu ekrana yazdir.

        for (int i=1; i<=10; i++) {

            System.out.println(n+" x "+i+" = "+n*i);

        }

    }

}