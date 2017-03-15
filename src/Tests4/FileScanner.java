package Tests4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/15/2017.
 */
public class FileScanner {
    public static void main(String[] args) throws FileNotFoundException {
        int num1;
        double num2;
        String name;

        Scanner in = new Scanner(new File("src/Tests4/in.txt"));
        num1 = in.nextInt();
        num2 = in.nextDouble();
        name = in.next();
        System.out.println("Hi!" +" " + name + "," + " the sum of " + num1 + " and " + num2 + " is " + (num1+num2));
        in.close();


    }
}
