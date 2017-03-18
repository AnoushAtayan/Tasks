package Tests5;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/18/2017.
 */
public class Oct2Dec {
    public static void main(String[] args) {
        String input;
        int inputLen;
        char oct;
        int decimal=0;
        System.out.print(" Enter the octal: ");
        Scanner sc = new Scanner(System.in);
        input =  sc.next();
        inputLen = input.length();
        for (int i = 0; i <inputLen ; i++) {
            int order = inputLen-i-1;
            oct =input.charAt(i);
            if(oct>='0'&& oct<='8'){
                decimal+= (oct -'0')*(int) Math.pow(8, order);

            }
            else {
                System.out.println("error: invalid octal input");
            }


        }
        System.out.println("The equivalent decimal of your input is " + decimal);

    }
}
