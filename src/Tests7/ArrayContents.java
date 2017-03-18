package Tests7;

/**
 * Created by Anoush Atayan on 3/18/2017.
 */
public class ArrayContents {
    public static void main(String[] args) {
        printArray(new int[]{5, 6, 7});
    }
    public static void printArray(int[] array){

        for (int i = 0; i <array.length ; i++) {
            if (i == array.length-1) {
                System.out.print(array[i]+"" + (i+1));
            }
            else System.out.print(array[i]+""+(i+1) +", ");
        }
    }

}
