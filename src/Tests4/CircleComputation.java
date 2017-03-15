package Tests4;


import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/15/2017.
 */
public class CircleComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();

   while (radius>0) {

       double area = Math.PI * radius * radius;
       double circumference = 2 * Math.PI * radius;
       System.out.println("The area is " + String.format("%.2f", area));
       System.out.println("The circumference is: " + String.format("%.2f", circumference));

       System.out.print("Enter a positive integer or -1 to exit: ");
       radius= in.nextDouble();

   }



    }
}
