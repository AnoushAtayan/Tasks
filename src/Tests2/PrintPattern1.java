package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class PrintPattern1 {
    public static void main(String[] args) {


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <8 ; j++) {
                if (j>=i){
                    System.out.print(" ");
                    System.out.print("#");
                }
                else System.out.print("  ");

            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 8; i++) {
            for (int j = 7; j >=0 ; j--) {
                if (j<=i){
                    System.out.print(" ");
                    System.out.print("#");
                }
                else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
