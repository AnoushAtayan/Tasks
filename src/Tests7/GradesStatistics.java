package Tests7;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anoush Atayan on 3/20/2017.
 */
public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        readGrades();  // Read and save the inputs in int[] grades
        printArray(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " +  median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + stdDev(grades));
    }

    public static void readGrades(){
        int numberOfStudents;
        int grade;
        System.out.print("Enter the number of students: ");
        Scanner sc = new Scanner(System.in);
        numberOfStudents = sc.nextInt();
        grades = new int[numberOfStudents];
        for (int i = 1; i <=numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + i + ": ");
            grade=sc.nextInt();
            if(grade<0 || grade>100){
                System.out.println("Invalid grade, try again");
                i = i-1;
            }
            else {
                {
                    grades[i-1] = grade;

                }
            }

        }


    }
    public  static void  printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            if(i==array.length-1){
                System.out.print(array[i]);
            }
            else {
                System.out.print(array[i] + ", ");
            }
        }

        System.out.println();

    }
    public static String average(int[] array){
        double average;
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i];

        }
        average = (double)sum/array.length;
        return String.format("%.2f", average);

    }

    public static String median(int[] array){
        double median;
        Arrays.sort(grades);

        if(array.length%2==0){
            median =((double)array[array.length/2] + (double)array[(array.length/2)-1])/2;
        }
        else median = (double)array[array.length/2];

        return String.format("%.2f", median);
    }

    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i]>max){
                max= array[i];
            }

        }
        return max;
    }

    public static int min(int[] array){
        Arrays.sort(array);
        int min = array[0];
        return min;
    }

    public static double stdDev(int[] array){

    }
}
