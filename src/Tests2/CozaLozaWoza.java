package Tests2;

/**
 * Created by Anoush Atayan on 3/13/2017.
 */
public class CozaLozaWoza {
    public static void main(String[] args) {

        int lowerBound = 1, upperBound =110;
        for(int number = lowerBound; number<=upperBound; number++){
            if(number%3==0&& number%5!=0&& number%7!=0){
                System.out.print("Coza ");
            }
            if(number%5==0&& number%3!=0){
                System.out.print("Loza ");
            }
            if(number%3==0 &&number%5==0){
                System.out.print("CozaLoza ");
            }
            if (number%7==0&& number%3!=0){
                System.out.print("Woza ");
            }
            if (number%7==0&& number%3==0){
                System.out.print("CozaWoza ");
            }

            if (number%3!=0 && number%5 !=0 && number%7!=0){
                if(number%11==0){
                    System.out.print(number + " ");
                    System.out.println();
                }
                else {
                    System.out.print(number + " ");

                }
            }

        }
    }
}
