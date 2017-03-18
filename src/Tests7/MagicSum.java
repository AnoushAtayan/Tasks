package Tests7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/18/2017.
 */
public class MagicSum {


    public static void main(String[] args) {
        int number;
        int sentinel = -1;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer or -1 to exit: ");
        number= in.nextInt();

        while (number!= sentinel){
            if (hasEight(number)==true){
                sum+=number;
            }
            else sum+=0;
            System.out.print("Enter a positive integer or -1 to exit: ");
            number = in.nextInt();

        }
        System.out.print("The magic sum is: " + sum);


    }

    public static boolean hasEight(int number){
        String num = String.valueOf(number);

           if (num.contains("8")){
               return true;

        }
        else return false;
    }
}
