package Tests2;

/**
 * Created by Anoush Atayan on 3/15/2017.
 */
public class PrintPattern4 {
    public static void main(String[] args) {
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <=i ; j++) {
                if(j==i){
                    System.out.print("#");
                }
                else{
                    System.out.print("  ");}

            }
            System.out.println();
            }


        }
    }
