public class Dovuscu {

    String isim;
    int hasar;
    int can;
    int agirlik;
    int engel;

    Dovuscu(String isim, int hasar, int can, int agirlik,int engel) {

        this.isim = isim;
        this.hasar = hasar;
        this.can = can;
        this.agirlik = agirlik;

        if (engel >= 0 && engel <= 100) {

            this.engel = engel;

        }

        else {

            this.engel = 0;

        }

    }

    int vurus (Dovuscu rakip) {

        System.out.println(this.isim + " => " + rakip.isim + " " + this.hasar + " hasar vurdu.");

        if (rakip.engelMi()){

            System.out.println("--------------");
            System.out.println(rakip.isim + " gelen hasarı blokladı!");
            System.out.println("--------------");
            return rakip.can;
        }

        if (rakip.can - this.hasar < 0) {

            return 0;

        }
        return rakip.can - this.hasar;
    }

    boolean  engelMi() {

        double rastgeleSayi = Math.random()*100;

        return rastgeleSayi <= this.engel;

    }

}
