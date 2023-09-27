import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n;

        n = input.nextInt();

        int[] array = new int[n];

        for (int i=0; i < n; i++) {

            array[i] = input.nextInt();

        }

        int count = 0;

        for (int i=0; i<n;i++) {

            int sum = 0;

            for (int j=i; j<n; j++) {

                sum+=array[j];

                if (sum<0) {

                    count++;

                }

            }

        }

        System.out.println(count);

    }
}