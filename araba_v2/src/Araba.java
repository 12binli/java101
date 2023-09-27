public class Araba {

    String tip;
    String model;
    String renk;
    int hiz;
    int hizLimiti;

    Araba(String model, int hiz,String renk) {

        this.model = model;
        this.hiz = hiz;
        this.renk = "yok";
        this.tip = "sedan";
        this.hizLimiti = 180;


    }

    void hizartir(int yukselt) {

        if ( (this.hiz+yukselt) < hizLimiti ) {

            this.hiz+=yukselt;

        }

    }

    void hizdusur(int azalt) {

        if ( (this.hiz+azalt) >0 ) {

            this.hiz-= azalt;

        }

    }

    void hizyazdir(){

        System.out.println(this.model + " hızınız : " + this.hiz);

    }

    void bilgiyazdir() {

        System.out.println("model : " + this.model);
        System.out.println("renk : " + this.renk);
        System.out.println("tip : " + this.tip);
        System.out.println("hız : " + this.hiz);

    }

}
