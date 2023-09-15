import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //değişkenleri oluştur.

        int n1,n2,ebob=0;

        //scanner sınıfını tanımla.

        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al.

        System.out.print("n1 sayısını giriniz : ");

        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz : ");

        n2 = input.nextInt();

        //sonucu ekrana yazdır.

        if (n1>n2) {

            /*

            //if ile yazılışı

            for(int j=n2; j>=1; j--) {

                if ( (n2%j==0) && (n1%j==0) ) {

                    ebob = j;
                    break;
                }

            }

            */

            int a = n2;
            while (a>=1) {

                if ( (n2%a==0) && (n1%a==0) ) {

                    ebob = a;
                    break;
                }

                a--;

            }

            System.out.println("n2 ve n1 sayısının ebobu : "+ebob);

        }

        else if (n1==n2) {

            ebob = n1;

            System.out.println("n1 ve n2 sayısının ebobu : "+ebob);

        }

        else {

            /*

            for (int i=1; i<=n1; i++) {

                if ( (n1%i==0) && (n2%i==0) )  {

                    ebob = i;

                }

            }

            */

            int b=1;

            while (b<=n1) {

                if ( (n1%b==0) && (n2%b==0) )  {

                    ebob = b;

                }

                b++;

            }

            System.out.println("n1 ve n2 sayısının ebobu : "+ebob);

        }

        int c=1;

        while ( c<= (n1*n2) ) {

            if ( (c%n1) == 0 && (c%n2)==0 ) {

                System.out.println("n1 ve n2 sayısının ekoku : "+ c);

                break;

            }

            c++;

        }

    }

}