package Tests6;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/18/2017.
 */
public class GradesAverage {
    public static void main(String[] args) {
        int numOfStudents;
        int grade;
        double averageGrade;
        int sum=0;
        System.out.print("Enter the number of students: ");
        Scanner sc = new Scanner(System.in);
        numOfStudents = sc.nextInt();
        int[]students = new int [numOfStudents];
        for (int i = 1; i <=students.length ; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            grade= sc.nextInt();
            if(grade<0|| grade>100){
                System.out.println("Invalid grade, try again");
                i=i-1;
            }
            else {
                sum += grade;
                if (grade >= 0 && grade <= 100) {
                    students[i - 1] = grade;
                }
            }
        }
        averageGrade=(double) sum/students.length;


        System.out.println("The average is: " + averageGrade);

    }
}
