import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        float yol=2.2f, acilis= 10f, km, ucret;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değeri al.

        System.out.println("Kaç kilometre gidilecek?");

        km = input.nextFloat();

        //taksimetre ücretini hesapla.

        ucret = yol*km+acilis;
        ucret = (ucret <=20) ? 20 : ucret;

        //sonucu ekrana yazdır.

        System.out.println("Ücret:"+ucret+"TL'dir.");

    }
        }