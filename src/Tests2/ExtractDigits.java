package Tests2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class ExtractDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        while (number>0){
            int digit = number%10;
            System.out.print(digit  + " ");
            number = number/10;
        }
    }
}
