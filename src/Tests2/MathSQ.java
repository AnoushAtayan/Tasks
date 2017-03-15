package Tests2;

/**
 * Created by Anoush Atayan on 3/13/2017.
 */
public class MathSQ {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <=100 ; i++) {
            int number = i*i;
            sum = sum+number;
            count++;

        }
        System.out.println(sum );
        System.out.println(count);
    }
}
