package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class PrintPattern2 {
    public static void main(String[] args) {
        for (int i = 0; i <7; i++) {
            if (i==0|| i==6){
                print1();
            }
            else print2();
            System.out.println();

        }


    }

    public static void print1(){
        for (int i = 0; i <7 ; i++) {
            System.out.print("# ");

        }
    }
    public static void print2(){
        System.out.print("#           #");
    }
}










