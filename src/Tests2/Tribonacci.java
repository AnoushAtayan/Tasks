package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class Tribonacci {
    public static void main(String[] args) {
        int tribonacci [] = new  int[20];
        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;
        tribonacci[3] = 4;
        for (int i = 4; i <20 ; i++) {
            tribonacci[i] = tribonacci[i-1] + tribonacci[i-2] + tribonacci[i-3];

        }
        for (int i = 0; i <20 ; i++) {
            System.out.print(tribonacci[i] + " ");

        }


    }
}
