package Tests5;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/17/2017.
 */
public class Bin2Dec {
    public static void main(String[] args) {
        String binStr;
        int binStrLen;
        int  decimal = 0;
        System.out.print("Enter a Binary string: ");
        Scanner sc = new Scanner(System.in);
        binStr = sc.next();
        binStrLen = binStr.length();

        for (int pos = 0; pos <binStrLen ; pos++) {
            int order  = binStrLen-1-pos;
            char binChar = binStr.charAt(pos);
            if(binChar=='1'){
                decimal = decimal+binChar*(int)Math.pow(2, order);


            }
            else if(binChar!='0'){
                System.out.println("error: invalid binary string \"" + binStr + "\"");
                System.exit(1);
            }

        }
        System.out.println("The equivalent decimal number for binary \"" +binStr + "\" is: " + decimal );
    }
}
