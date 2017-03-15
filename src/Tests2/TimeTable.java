package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class TimeTable {
    public static void main(String[] args) {
        System.out.print("*  | ");
        for (int i = 1; i <=9 ; i++) {
            System.out.print(" " +i  + " ");

        }
        System.out.println();
        System.out.print("-------------------------------");
        System.out.println();
        for (int i = 1; i <=9 ; i++) {
            System.out.print(i + "  | ");
            for (int j = 1; j <=9 ; j++) {
                if(i*j<=9){

                System.out.print(" "+i*j + " ");}
                else {
                    System.out.print(i*j + " ");
                }


            }
            System.out.println();






            }


        }
    }

