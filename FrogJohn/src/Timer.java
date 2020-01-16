import java.util.Scanner;

/**
 * @author Gayan Samuditha
 */

public class Timer {

    public void frogTimeCalculation() {

        int fullDistance;

        Scanner input = new Scanner(System.in);            //creating new object in scanner method
        System.out.print("Enter Frog Distance to Calculate Time : ");
        fullDistance = input.nextInt();

        int currentDistance = fullDistance;

        currentDistance = currentDistance / 9;

        if (fullDistance % 9 == 0) {
            System.out.println("Time calculation on " + fullDistance + " meter is " + (currentDistance * 8)+" seconds");

        }else if((1<=fullDistance) && (fullDistance<=5)){
            System.out.println("Time calculation on " + fullDistance + " meter is " + ((currentDistance * 8)+1)+" seconds");

        }else if((6<=fullDistance) && (fullDistance<=8)){
            System.out.println("Time calculation on " + fullDistance + " meter is " + ((currentDistance * 8)+3)+" seconds");

        }else{
            System.out.println("Time calculation on " + fullDistance + " meter is " + ((currentDistance * 8)+8)+" seconds");

        }

    }


}
