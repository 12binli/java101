public class Main {

    public static void main(String[] args) {

        Araba audi = new Araba();
        audi.model = "audi";
        audi.hiz = 10;
        audi.hizartir(20);
        audi.hizdusur(10);
        audi.hizyazdir();

        Araba bmw = new Araba();
        bmw.model = "bmw";
        bmw.hiz = 20;
        bmw.hizyazdir();

        Araba mercedes = new Araba();
        mercedes.model = "mercedes";
        mercedes.hiz = 30;

    }

}