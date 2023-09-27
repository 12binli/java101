public class Main {

    public static void main(String[] args) {

        Araba audi = new Araba("audi",10,"mavi");

        audi.bilgiyazdir();

        Araba bmw = new Araba("bmw",20,"");
        bmw.bilgiyazdir();

        Araba mercedes = new Araba("mercedes",30,"yok");
        mercedes.bilgiyazdir();

    }

}