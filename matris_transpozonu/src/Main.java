import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.println("matrisin satır sayısını giriniz.");

        a = input.nextInt();

        System.out.println("matrisin sütun sayısını giriniz.");

        b= input.nextInt();

        int[][] matris = new int[a][b];

        for (int i=0; i< matris.length; i++) {

            for (int j=0; j< matris[i].length; j++) {

                System.out.println( (i+1) + ". satırın " + (j+1) + ". sütununu giriniz.");

                matris[i][j] = input.nextInt();

                // 3 3 0 3 6 9 12 15 18 21 24
                // 2 3 2 3 4 5 6 4
                // 2 3 1 2 3 4 5 6
            }

        }

        System.out.println("Matris : ");

        Matris.yazdir(matris);


        System.out.println("Transpoze : ");

        Matris.yazdir(Matris.cevir(matris));

    }

}