package Tests2;

/**
 * Created by Anoush Atayan on 3/15/2017.
 */
public class PrintPattern3 {
    public static void main(String[] args) {

        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <6 ; j++) {
                if(i==0){
                    System.out.print("# ");
                }
            }

            for (int j = 0; j <=i ; j++) {
               if(j==i){
                   System.out.print("#");
               }
                else{
                   System.out.print("  ");}

            }

            System.out.println();

        }
        for (int i = 0; i <7 ; i++) {
            if (i==6){
                for (int j = 0; j <7 ; j++) {
                    System.out.print("# ");
                }

            }

        }

    }
}
