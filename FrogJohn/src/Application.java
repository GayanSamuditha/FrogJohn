import java.util.Scanner;

/**
 * @author Gayan Samuditha
 */

public class Application {

    public static void main(String[] args) {

        System.out.println("------------------------------------------");
        System.out.println("Welcome to JOHN - FROG ->>>>>>>>>>>>>>>>>>");
        System.out.println("------------------------------------------");
        System.out.println();
        System.out.println("Please input keys for start the Game !!!!!");
        System.out.println("Enter : Number 1 to get Distance        ->");
        System.out.println("Enter : Number 2 to get Time            ->");
        System.out.println("Enter : Number 3 to Exit the Game ------->");
        System.out.println();

        int inputValue = 0;

        while(inputValue!=3) {

            System.out.println("Enter : Any value to start the program");
            Scanner input = new Scanner(System.in);
            inputValue = input.nextInt();


            if (inputValue == 1) {
                Timer timeCal = new Timer();
                timeCal.frogTimeCalculation();
            }

            if (inputValue == 2) {
                DistanceCalculation distanceCalculation = new DistanceCalculation();
                distanceCalculation.frogDistanceCalculation();
            }

        }
    }

}
