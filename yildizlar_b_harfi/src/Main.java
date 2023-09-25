public class Main {
    public static void main(String[] args) {

        String[][] bharfi = new String[5][4];

        for (int i=0; i < bharfi.length; i++) {

            for(int j=0; j<bharfi[i].length; j++) {

                if ( (i==0) || (i==4) || (i==2)) {

                    bharfi[i][j] = " * ";

                }

                else if ( (j==0) || (j==3) ) {

                    bharfi[i][j] = " * ";

                }

                else {

                    bharfi[i][j] = "   ";

                }

            }

        }

        for (String[] satir : bharfi) {

            for (String sutun : satir) {

                System.out.print(sutun);

            }

            System.out.println();

        }

    }
}