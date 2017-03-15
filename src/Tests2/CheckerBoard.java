package Tests2;

/**
 * Created by Anoush Atayan on 3/14/2017.
 */
public class CheckerBoard {
    public static void main(String[] args) {
        int size = 7;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("# ");
            }

            System.out.println();
            if (row % 2 == 0) {
                System.out.print(" ");
            } else {

            }
        }
    }
}
