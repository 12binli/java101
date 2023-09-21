public class Mac {
    Dovuscu d1;
    Dovuscu d2;
    int minAgirlik;
    int maxAgirlik;

    Mac(Dovuscu d1, Dovuscu d2, int minAgirlik, int maxAgirlik) {

        if (basla()) {
            this.d1 = d1;
            this.d2 = d2;
        }
        else {
            this.d1 = d2;
            this.d2 = d1;
        }

        this.minAgirlik = minAgirlik;
        this.maxAgirlik = maxAgirlik;

    }

    void baslat() {

        if (kontrol()){

            while (this.d1.can > 0 && this.d2.can > 0) {

                System.out.println("====YENİ ROUND====");

                this.d2.can = this.d1.vurus(this.d2);

                if (kazan()) {
                    break;
                }

                this.d1.can = this.d2.vurus(this.d1);

                if (kazan()) {
                    break;
                }

                System.out.println(this.d1.isim + " Sağlık : " + this.d1.can);

                System.out.println(this.d2.isim + " Sağlık : " + this.d2.can);

            }

        }
        else {

            System.out.println("sporcuların sikletleri uymuyor.");

        }

    }

    boolean basla() {

        double rastgeleSayi = Math.random()*100;

        return 50 <= rastgeleSayi;

    }

    boolean kontrol() {

        return (this.d1.agirlik >= minAgirlik && this.d1.agirlik <= maxAgirlik) && (this.d2.agirlik >= minAgirlik && this.d2.agirlik <= maxAgirlik);

    }

    boolean kazan() {

        if (this.d1.can == 0) {

            System.out.println(this.d2.isim + " kazandı !");
            return true;

        }

        if (this.d2.can == 0) {

            System.out.println(this.d1.isim + " kazandı !");
            return true;

        }

        return false;

    }

}
