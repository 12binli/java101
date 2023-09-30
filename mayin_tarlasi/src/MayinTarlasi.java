import java.util.Scanner;

public class MayinTarlasi {

    int satir;
    int sutun;
    String[][] gizliHarita;
    String[][] harita;
    int mayinSayisi = 0;
    int satirI;
    int sutunI;

    MayinTarlasi(int satir, int sutun) {

        this.satir = satir;
        this.sutun = sutun;
        this.gizliHarita = new String[satir][sutun];
        this.harita = new String[satir][sutun];

    }

    void haritaDoldur(String[][] harita) {

        for (int i = 0; i < this.satir; i++) {

            for (int j = 0; j < this.sutun; j++) {

                harita[i][j] = "-";

            }

        }

    }

    void mayinDoldur() {

        while (mayinSayisi < (this.satir * this.sutun) / 4){

            int r1 = (int) (Math.random() * this.satir);
            int r2 = (int) (Math.random() * this.sutun);

            if (!this.gizliHarita[r1][r2].equals("*")) {

                this.gizliHarita[r1][r2] = "*";

                mayinSayisi++;

            }

        }

        /*

        for (int i = 0; i < mayinSayisi; i++) {

            int r1 = (int) (Math.random() * this.satir);
            int r2 = (int) (Math.random() * this.sutun);

            if (!this.gizliHarita[r1][r2].equals("*")) {

                this.gizliHarita[r1][r2] = "*";

            }

        }

         */

    }

    void haritaYazdir(String[][] harita) {

        for (int i = 0; i < this.satir; i++) {

            for (int j = 0; j < this.sutun; j++) {

                System.out.print(harita[i][j] + " ");

            }

            System.out.println();

        }

    }

    void secimYap() {

        Scanner input = new Scanner(System.in);

        boolean dogruMu = false;

        while (!dogruMu) {

            System.out.println("kaçıncı satır giriniz.");

            satirI = input.nextInt() - 1;

            System.out.println("kaçıncı sütun giriniz.");

            sutunI = input.nextInt() - 1;

            System.out.println();

            if (satirI>= this.satir || sutunI >= this.sutun) {

                System.out.println("mayın tarlası alanının dışında bir giriş yaptınız. tekrar deneyiniz.");
                System.out.println();
                continue;

            }

            if (gizliHarita[satirI][sutunI].equals("*")) {

                System.out.println("kaybettiniz! (*'lar mayınları temsil etmektedir.)");

                System.out.println();

                break;

            }

            hucreDoldur();

            if (bittiMi()) {

                System.out.println("kazandınız! (*'lar mayınları temsil etmektedir.)");
                dogruMu = true;

            }

            else {

                haritaYazdir(this.harita);

            }

            System.out.println();

        }

    }

    void hucreDoldur() {

        int sayac = 0;

        for (int i = (satirI-1); i <= (satirI+1); i++) {

            for (int j = (sutunI-1); j <= (sutunI+1); j++) {

                if (i<0 || j<0 || i>= this.satir || j>= this.sutun) {

                    continue;

                }
                if(this.gizliHarita[i][j].equals("*")) {

                    sayac++;

                }

            }

        }

        this.harita[satirI][sutunI] = String.valueOf(sayac);
        this.gizliHarita[satirI][sutunI] = String.valueOf(sayac);

    }

    boolean bittiMi () {

        for (int i = 0; i < this.satir; i++) {
            for (int j = 0; j < this.sutun; j++) {
                if (this.gizliHarita[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;

    }

    void calistir() {

        haritaDoldur(this.gizliHarita);
        mayinDoldur();
        haritaYazdir(this.gizliHarita);
        System.out.println();
        haritaDoldur(this.harita);
        haritaYazdir(this.harita);
        System.out.println();
        secimYap();
        haritaYazdir(this.gizliHarita);

    }

}
