package Tests3;

/**
 * Created by Anoush Atayan on 3/15/2017.
 */
public class Factorial {
    public static void main(String[] args) {
          int n = 20;
         long factorial = 1;
        for (int i = 1; i <=n ; i++) {
            factorial =  factorial*i;


        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
