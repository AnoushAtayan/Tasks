package Tests2;

/**
 * Created by Anoush Atayan on 3/13/2017.
 */
public class HarmonicSum {
    public static void main(String[] args) {
        int maxDenominator =5000;
        double sumL2R = 0.0;
        double sumR2L = 0.0;
        for(int denominator = 1; denominator<=maxDenominator; ++denominator){
           sumL2R= sumL2R +(double)1/denominator;
        }
        for(int denominator =maxDenominator; denominator>=1; --denominator) {
            sumR2L = sumR2L+(double)1/denominator;
        }
        System.out.println(sumL2R);
        System.out.println(sumR2L);
    }
}
