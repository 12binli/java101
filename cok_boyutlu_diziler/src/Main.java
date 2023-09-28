public class Main {

    public static void main(String[] args) {

        /*

        int[][] matris = new int[4][4];

        Scanner input = new Scanner(System.in);

        System.out.println(matris.length + " satır ve " + matris[0].length + " sütun giriniz: ");

        for (int satir = 0; satir < matris.length; satir++) {

            for (int sutun = 0; sutun < matris[satir].length; sutun++) {

                matris[satir][sutun] = input.nextInt();

            }

        }

        for (int sutun = 0; sutun < matris[0].length; sutun++) {

            for (int satir = 0; satir < matris.length; satir++) {


                System.out.print(matris[satir][sutun]+" ");

            }

            System.out.println();

        }

         */

        int[][] matris2 = new int[4][4];

        for (int sutun = 0; sutun < matris2[0].length; sutun++) {

            for(int satir = 0; satir < matris2.length; satir++) {

                matris2[satir][sutun] = (int) (Math.random()*100);

            }

        }

        for (int sutun = 0; sutun < matris2[0].length; sutun++) {

            for (int satir = 0; satir < matris2.length; satir++) {


                System.out.print(matris2[satir][sutun]+" ");

            }

            System.out.println();

        }

    }

}