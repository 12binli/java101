public class Main {

    public static void main(String[] args) {

        Ders tarih = new Ders("tarih","101","TRH");

        Ders fizik = new Ders("fizik","102","FZK");

        Ders biyoloji = new Ders("biyoloji","101","BIO");

        Ogretmen ogrt1 = new Ogretmen("mahmut hoca","+905000000","TRH");

        Ogretmen ogrt2 = new Ogretmen("graham bell","+905000000","FZK");

        Ogretmen ogrt3 = new Ogretmen("külyutmaz","+905000000","BIO");

        tarih.ogrtEkle(ogrt1);

        tarih.ogrtYazdir();

        fizik.ogrtEkle(ogrt2);

        biyoloji.ogrtEkle(ogrt3);

        biyoloji.ogrtYazdir();

        Ogrenci ogr1 = new Ogrenci("inek şaban","123","4", tarih, fizik, biyoloji);

        ogr1.toplunotgir(50,20,40,70,80,90);

        ogr1.gectiMi();

        Ogrenci ogr2 = new Ogrenci("güdük necmi","444","4", tarih, fizik, biyoloji);

        ogr2.toplunotgir(100,50,40,70,80,90);

        ogr2.gectiMi();

    }

}