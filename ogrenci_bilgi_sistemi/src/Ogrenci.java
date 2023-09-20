public class Ogrenci {

    Ders d1;
    Ders d2;
    Ders d3;
    String isim;
    String ogrno;
    String sinif;
    int ort;

    boolean gectiMi;

    Ogrenci(String isim, String ogrno,String sinif, Ders d1, Ders d2,Ders d3) {

        this.isim = isim;
        this.ogrno = ogrno;
        this.sinif = sinif;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ort = 0;
        this.gectiMi = false;

    }

    void toplunotgir(int not1, int not1Sozlu, int not2, int not2Sozlu, int not3, int not3Sozlu) {

        if (not1 >= 0 && not1 <=100) {

            this.d1.not = not1;

        }

        if (not1Sozlu >= 0 && not1Sozlu <=100) {

            this.d1.sozlu = not1Sozlu;

        }

        if (not2 >= 0 && not2 <=100) {

            this.d2.not = not2;

        }

        if (not2Sozlu >= 0 && not2Sozlu <=100) {

            this.d2.sozlu = not2Sozlu;

        }

        if (not3 >= 0 && not3 <=100) {

            this.d3.not = not3;

        }

        if (not3Sozlu >= 0 && not3Sozlu <=100) {

            this.d3.sozlu = not3Sozlu;

        }

    }

    void gectiMi() {

        this.gectiMi = gectiMiKontrol();
        notYazdir();
        System.out.println("ortalama : " + this.ort);
        if (this.gectiMi) {

            System.out.println("sınıfı geçti.");

        }
        else {

            System.out.println("sınıfta kaldı.");

        }

    }

    void ortHesapla() {

        double d1Ort = this.d1.not*0.8 + this.d1.sozlu*0.2;
        double d2Ort = this.d2.not*0.8 + this.d2.sozlu*0.2;
        double d3Ort = this.d3.not*0.8 + this.d3.sozlu*0.2;


        double ort = (d1Ort + d2Ort + d3Ort) / 3;

        this.ort = (int) ort;

    }

    boolean gectiMiKontrol() {

        ortHesapla();
        return this.ort > 55;

    }

    void notYazdir() {

        System.out.println("=========================");
        System.out.println("öğrenci : " + this.isim);
        System.out.println("matematik notu : " + this.d1.not);
        System.out.println("matematik sözlü notu : " + this.d1.sozlu);
        System.out.println("-------------------------");
        System.out.println("fizik notu : " + this.d2.not);
        System.out.println("fizik sözlü notu : " + this.d2.sozlu);
        System.out.println("-------------------------");
        System.out.println("kimya notu : " + this.d3.not);
        System.out.println("kimya sözlü notu : " + this.d3.sozlu);
        System.out.println("-------------------------");

    }
}
