import java.util.Arrays;

public class Dizi {

    static String yazdir(int[] dizi) {

        return Arrays.toString(dizi);

    }

    static int[] tekrarEden(int[] dizi) {

        int[] tekrar = new int[dizi.length];

        int bas = 0;

        for (int i = 0; i < dizi.length; i++) {

            for (int j = 0; j < dizi.length; j++) {

                if ((i != j) && (dizi[i] == dizi[j])) {

                    if ((!tekrarMi(tekrar, dizi[i])) && (dizi[i] % 2 == 0)) {

                        tekrar[bas++] = dizi[i];

                    }

                }

            }

        }

        return Dizi.cevirici(tekrar);

    }

    static boolean tekrarMi(int[] dizi, int deger) {

        for (int i : dizi) {

            if (i == deger) {

                return true;

            }

        }

        return false;

    }

    static int[] cevirici(int[] dizi) {

        int sayac = 0;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] != 0) {

                sayac++;

            }

        }

        int sayac2 = 0;

        int[] ceviri = new int[sayac];

        for (int i = 0; i < dizi.length; i++) {


            if (dizi[i] != 0) {

                ceviri[sayac2] = dizi[i];
                sayac2++;

            }

        }

        return ceviri;

    }

}
