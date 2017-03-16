package Tests5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/16/2017.
 */
public class CheckVowelsDigits {
    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: " );
        input = in.next();

        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();

        for (char x:input.toCharArray()) {
            if(x >='0'&& x<='9'){
                digits.add(x);
            }
            if (x=='a'||x=='A'|| x =='e'||x =='E'|| x=='i'||x=='I'||x=='o'||x=='O'||x=='u'||x=='U'){
               vowels.add(x);
           }

        }
        double number1 =  (double)vowels.size()/input.length()*100;
        double number2 =  (double)digits.size()/input.length()*100;
        System.out.println("Number of vowels: " + vowels.size() + " (" + String.format("%.2f",number1) + "%)");
        System.out.println("Number of digits: " + digits.size() + " (" + String.format("%.2f",number2) + "%)");

    }



}
