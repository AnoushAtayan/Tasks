package Tests2;

/**
 * Created by Anoush Atayan on 3/13/2017.
 */
public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        double maxDenominator = 10000000;
        for(int denominator = 1; denominator<=maxDenominator; denominator+=2){
           if (denominator%4 ==1){
               sum  +=(double)1/denominator;
           }
            else if (denominator%4==3){
               sum-=(double)1/denominator;
           }
            else System.out.println("The computer has gone crazy?!");
        }
        System.out.println(4*sum);
        System.out.println(Math.PI);
    }

}
