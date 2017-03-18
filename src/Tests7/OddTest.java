package Tests7;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/18/2017.
 */
public class OddTest {
    public static void main(String[] args) {
        int input;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        input =  sc.nextInt();
        if (isOdd(input)==true){
            System.out.println("ODD");
        }
        else System.out.println("EVEN");

    }
    public static boolean isOdd(int number){

        if(number%2!=0)
            return true;
        else return false;


    }

}
