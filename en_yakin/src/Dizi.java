import java.util.Arrays;

public class Dizi {

    static void enYakinBuyuk (int[]dizi,int sayi) {

        for (int i : dizi) {

            if (i>=sayi) {

                System.out.println("en yakın en büyük dizi elamanı : " + i);

                break;
            }

        }

    }

    static void enYakinKucuk (int[]dizi,int sayi) {

        for (int i : dizi) {

            if (i<=sayi) {

                System.out.println("en yakın en küçük dizi elamanı : " + i);

                break;
            }

        }

    }

    static String yazdir (int[]dizi) {

        return Arrays.toString(dizi);

    }

    static void sirala (int[]dizi) {

        Arrays.sort(dizi);

    }

    static void tersSirala (int[]dizi) {

        for(int i=0; i< dizi.length; i++)

            dizi[i]= dizi[i]*-1;

       Dizi.sirala(dizi);

        for(int i=0; i< dizi.length; i++)

            dizi[i]= dizi[i]*-1;

    }

}
