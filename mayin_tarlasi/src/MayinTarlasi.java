import java.util.Random;

public class MayinTarlasi {

    Random rastgele = new Random();
    int satir;
    int sutun;
    int mSayisi=0;
    int rastgeleX;
    int rastgeleY;
    int[][] mayinHaritasi;
    String[][] harita;

    MayinTarlasi (int satir, int sutun) {

        this.satir = satir;
        this.sutun = sutun;
        this.mayinHaritasi = new int[satir][sutun];
        this.harita = new String[satir][sutun];

        for (String[] str : harita ) {

            for (int i = 0; i<sutun; i++) {

                str[i] = "_";

            }

        }

    }

    void rastgeleMayinEkle (int satir,int sutun) {

        while (mSayisi < (satir*sutun/4)) {

            rastgeleX = rastgele.nextInt(satir);
            rastgeleY = rastgele.nextInt(sutun);

            if (bosMu(rastgeleX,rastgeleY)) {

                mayinHaritasi[rastgeleY][rastgeleY] = 1;
                mSayisi++;

            }

        }

    }

    boolean bosMu (int satir, int sutun) {

        if (mayinHaritasi[satir][sutun]==0) {

            return true;
        }
        else {

            return false;

        }

    }

    boolean patladiMi (int satir, int sutun) {

        if (bosMu(satir,sutun)) {

            return false;

        }
        else {

            return true;

        }

    }

    boolean kontrolMu (int satir,int sutun) {

        if (harita[satir][sutun].equals("_")) {

            return false;

        }
        else {

            return true;
        }

    }

    void mayinKontrol(int satir, int sutun) {

        int mayinSayac = 0;

        for (int i= satir-1; i<= satir+1; i++) {

            for (int j= sutun -1; j<= sutun+1; j++) {

                if (i >= 0 && i < satir && j>=0 && j<sutun) {

                    if (!bosMu(i,j)) {

                        mayinSayac++;

                    }

                }

            }

        }

        harita[satir][sutun] = Integer.toString(mayinSayac);

    }

    void haritaYazdir() {

        for (String[] satir : harita) {

            for (String sutun : satir) {

                System.out.print(sutun + " ");

            }

            System.out.println();

        }

    }

}
