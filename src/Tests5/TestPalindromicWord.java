package Tests5;

import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/16/2017.
 */
public class TestPalindromicWord {
    public static void main(String[] args) {
        String input;
        System.out.print("Enter a word: ");
        Scanner in = new Scanner(System.in);

        input= in.next();
        int fIdx;
        int bIdx;
        boolean isPalindrome = false;

        for (char x:input.toCharArray()) {
            if (!Character.isLetter(x)){

            }
            else {
                for(fIdx=0,bIdx =input.length()-1;fIdx<=(input.length())/2; fIdx++, bIdx--){
                    if(input.toLowerCase().toCharArray()[fIdx] == input.toLowerCase().toCharArray()[bIdx]){
                        isPalindrome=true;
                    }

                }
            }

        }
        if(isPalindrome){
            System.out.println(input + " is a palindrome");
        }
        else {
            System.out.println(input + " is not a palindrome");
        }
    }
}
