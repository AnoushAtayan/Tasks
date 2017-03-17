package Tests5;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/17/2017.
 */
public class Hex2Dec {
    public static void main(String[] args) {
        String hexStr;
        char hexChar;
        int decimal = 0;

        System.out.print("Enter a Hexadecimal string: ");
        Scanner in = new Scanner(System.in);
        hexStr = in.next();

        for (int i = 0; i < hexStr.length(); i++) {
            int order = hexStr.length()-1-i;
            hexChar = hexStr.charAt(i);
            if(hexChar>='0'&& hexChar<='9'){
                decimal+=(hexChar-'0') * (int)Math.pow(16, order);
            }
            else if(hexChar>='a'&& hexChar<='f'){
                decimal+=(hexChar-'a' +10) * (int)Math.pow(16, order);
            }
            else if(hexChar>='A'&& hexChar<='F'){
                decimal+=(hexChar-'A' +10) * (int)Math.pow(16, order);
            }
            else {
                System.out.println("error: invalid hexadecimal string");
                System.exit(1);
            }


        }
        System.out.println("The equivalent decimal number \"" +hexStr + "\"" + " is: "  +decimal);

    }
}
