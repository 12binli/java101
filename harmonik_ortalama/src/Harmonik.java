public class Harmonik {

    static double ortalama(int[] dizi) {

        double harmonikSeri = 0;


        for (int i : dizi) {

            harmonikSeri += (1.0 / i);

        }

        /*

        for (int i=0 ; i<dizi.length ; i++ ) {

           harmonikSeri+=(1.0/dizi[i]);

        }

         */

        double harmonikOrt = dizi.length / harmonikSeri;

        return harmonikOrt;

    }

}
