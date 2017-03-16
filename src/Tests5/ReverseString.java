package Tests5;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/16/2017.
 */
public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();


        for (int i = inStrLen-1; i >=0 ; i--) {
            System.out.print(inStr.charAt(i));

        }

    }

}
