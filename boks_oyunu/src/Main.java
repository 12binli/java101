public class Main {

    public static void main(String[] args) {

        Dovuscu d1 = new Dovuscu("A",10,120,100,30);
        Dovuscu d2 = new Dovuscu("B",20,85,85, 40);

        Mac mac = new Mac(d1,d2,85,100);
        mac.baslat();

    }

}