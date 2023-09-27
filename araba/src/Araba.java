public class Araba {

    String tip;
    String model;
    String renk;
    int hiz;
    int hizLimiti = 180;

    void hizartir(int yukselt) {

        if ( (hiz+yukselt) < hizLimiti ) {

            hiz+=yukselt;

        }

    }

    void hizdusur(int azalt) {

        if ( (hiz+azalt) >0 ) {

            hiz-= azalt;

        }

    }

    void hizyazdir(){

        System.out.println(model + " hızınız : " + hiz);

    }

}
