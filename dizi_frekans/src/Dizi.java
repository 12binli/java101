public class Dizi {

    static void frekans(int[] dizi) {

        for (int i=0; i< dizi.length; i++) {

            int sayac = 0;

            boolean tekrarMi = false;

            for (int k=i-1; k>=0;k--) {

                if (dizi[i]==dizi[k]) {

                    tekrarMi = true;

                    break;

                }

            }

            if (!tekrarMi) {

                for (int j = 0; j < dizi.length; j++) {

                    if (dizi[i] == dizi[j]) {

                        sayac++;

                    }

                }

            }

            if(sayac >=1) {

                System.out.println(dizi[i]+" sayısının tekrar edilme sayısı : "+sayac);

            }

        }

    }

    /*

    static void frekans2(int[] dizi) {

        for (int i=0; i< dizi.length; i++) {

            int sayac = 0;
            boolean sayildiMi = false;

            for (int j = i-1 ; j >=0 ; j--) {

                if (dizi[i]==dizi[j]) {

                    sayildiMi = true;
                    break;

                }

            }

            if(!sayildiMi){

                for (int k=0; k< dizi.length; k++) {

                    if (dizi[k]==dizi[i]) {

                        sayac++;

                    }

                }

            }

            if(sayac>=2) {

                System.out.println(dizi[i]+" sayısının tekrar etme sayısı : "+sayac);

            }

        }

    }

    */

}
