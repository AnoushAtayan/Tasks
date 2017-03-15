package Tests2;

/**
 * Created by Anoush Atayan on 3/13/2017.
 */
public class SumAndAverage {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerBound = 1;
        int upperBound = 100;
        /*for(int number = lowerBound; number<=upperBound; ++number){
            sum +=number;
        }
        average = (double) sum/100;*/

        //int number = lowerBound;
       /* while (number<=upperBound){
            sum+=number;
            number++;
        }*/
     /*   do {
            sum+=number;
            number++;
        }while (number<=100);*/
        int count =0;

        for (int number = lowerBound; number <=upperBound; number++) {
            if (number % 7 == 0) {
                sum += number;
                count++;
            } else {
            }
        }


        average =(double)sum/count;


        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

        for (int i = 111; i <=8899 ; i++) {
            sum+=i;
            count++;

        }
        System.out.println(count);
        System.out.println(sum);
        System.out.println(sum/count);
    }
}
