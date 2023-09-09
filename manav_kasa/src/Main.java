import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        float armut=2.14f, elma=3.67f, domates=1.11f, muz=0.95f, patlican=5.00f, toplam=0f;

        //Scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("Armut Kaç Kilo? :");

        toplam += input.nextFloat()*armut;

        System.out.print("Elma Kaç Kilo? :");

        toplam += input.nextFloat()*elma;

        System.out.print("Domates Kaç Kilo? :");

        toplam += input.nextFloat()*domates;

        System.out.print("Muz Kaç Kilo? :");

        toplam += input.nextFloat()*muz;

        System.out.print("Patlıcan Kaç Kilo? :");

        toplam += input.nextFloat()*patlican;

        //sonucu ekrana yazdır.

        System.out.println("Toplam Tutar : " + toplam + " TL");

    }

}