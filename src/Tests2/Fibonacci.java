package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn;
        int fnMinus1 = 1;
        int fnMinus2 = 1;
        int nMax = 20;
        int sum=0 ;
        double average;
        int count=0;

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        while (n <= nMax) {
            int fibonacci[] = new int[20];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            fibonacci[2] = 2;
            fibonacci[3] = 3;
            for (int i = 4; i < 20; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

            }
            for (int i = 0; i < 20; i++) {
                n = fibonacci[i];
                System.out.print(fibonacci[i] + " ");

                sum = sum+n;
                count++;


            }

        }
        System.out.println("");
        average = (double) sum/count;
        System.out.println(average);


    }
}
