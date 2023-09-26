public class Matris {

    static void yazdir(int[][] matris) {

        for (int[] i : matris) {

            for (int j : i) {

                System.out.print(" "+ j +" ");

            }

            System.out.println();

        }

    }

    static int[][] cevir (int[][] matris) {

        int[][] temp = new int[matris[0].length][matris.length];

        for (int i=0; i< matris.length; i++) {

            for (int j=0; j< matris[i].length; j++) {

                temp[j][i] = matris[i][j] ;

            }

        }

        return temp;

    }

}
