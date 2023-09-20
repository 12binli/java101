public class Ders {

    Ogretmen ogretmen;
    String isim;
    String kod;
    String kisalt;
    int not;
    int sozlu;

    Ders(String isim,String kod, String kisalt) {

        this.isim = isim;
        this.kod = kod;
        this.kisalt = kisalt;
        this.not = 0;
        this.sozlu = 0;

    }

    void ogrtEkle(Ogretmen ogretmen) {

        if (ogretmen.bolum.equals(this.kisalt)) {

            this.ogretmen = ogretmen;

            System.out.println("işlem başarılı.");

        }

        else {

            System.out.println(ogretmen.isim + " bu dersi veremez.");

        }

    }

    void ogrtYazdir(){

        if (ogretmen !=null) {

            System.out.println(this.isim + " dersinin akademisyeni : " + ogretmen.isim);

        }

        else {

            System.out.println(this.isim + " dersine akademisyen atanmamıştır.");

        }

    }

}
