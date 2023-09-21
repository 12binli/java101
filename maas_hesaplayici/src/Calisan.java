public class Calisan {

    String isim;
    double maas;
    int calismaSaati;
    int baslangicYili;

    Calisan(String isim,double maas,int calismaSaati,int baslangicYili) {

        this.isim = isim;
        this.maas = maas;
        this.calismaSaati = calismaSaati;
        this.baslangicYili = baslangicYili;

    }

    double vergi () {

        double vergi = 0;

        if (this.maas<=1000 && this.maas>=0) {

            System.out.println("1000TL'den düşük maaş için vergi alınmamaktadır.");

        }

        else if (this.maas >1000) {

            vergi = this.maas*0.03;

        }

        else {

            System.out.println("geçerli bir maaş giriniz.");

        }

        return vergi;

    }

    int bonus () {

        int bonusMiktar = 0;

        if (this.maas > 0) {

            if (this.calismaSaati>40) {

                bonusMiktar = (this.calismaSaati-40)*30;

            }

        }

        return bonusMiktar;

    }

    int maasArtir () {

        int buYil = 2021;

        int kacYil;

        double artir = 0;

        kacYil = buYil - this.baslangicYili;

        if (this.maas > 0) {

            if (kacYil >=20) {

                artir = this.maas * 0.15;

            }

            else if (kacYil <=18 && kacYil>9) {

                artir = this.maas * 0.1;

            }

            else if (kacYil<=9 && kacYil>=0) {

                artir = this.maas * 0.05;

            }

            else {

                System.out.println("geçerli bir yıl giriniz.");

            }

        }



        int artirInt = (int) artir;

        return artirInt;

    }

    String stringE() {

        int maasArtis = maasArtir();
        double vergi = vergi();
        int bonus = bonus();

        double toplam = this.maas +bonus -vergi + maasArtis;
        double bonusVeVergi = this.maas +bonus -vergi;
        double artis = bonus + maasArtis;


        System.out.println("Çalışanın ismi: " + this.isim);
        System.out.println("Çalışanın maaşı: " + this.maas);
        System.out.println("Çalışanın çalışma saati: " + this.calismaSaati);
        System.out.println("Çalışanın işe başlama tarihi: " + this.baslangicYili);
        System.out.println("Çalışanın maaşındaki vergi kesintisi: "+vergi);
        System.out.println("Çalışanın maaşındaki bonus: "+bonus);
        System.out.println("Çalışanın maaş artışı: " + artis);
        System.out.println("Çalışanın vergi ve bonuslarla birlikte maaşı: " + bonusVeVergi);
        System.out.println("Çalışanın toplam maaşı: "+toplam);
        return "İşlem Tamamlandı";

    }

}
