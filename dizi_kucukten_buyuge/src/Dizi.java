import java.util.Arrays;

public class Dizi {

    static String yazdir(int[] dizi) {

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
