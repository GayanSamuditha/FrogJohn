import java.util.Scanner;

/**
 * @author Gayan Samuditha
 */

public class DistanceCalculation {

    public void  frogDistanceCalculation() {
        int fullDistance;
        int relaxTime;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Time: ");
        relaxTime = input.nextInt();

        int currentTime = relaxTime;
        currentTime = currentTime / 8;

        if (relaxTime % 8 == 0) {
            System.out.println("Distance calculation on " + relaxTime + " seconds is " + (currentTime * 9)+" meters");
        }else if(relaxTime%8==1){
            System.out.println("Distance calculation on " + relaxTime + " seconds is " + ((currentTime * 9)+5)+" meters");
        }else if((relaxTime%8==3)||(relaxTime%8==2)){
            System.out.println("Distance calculation on " + relaxTime + " seconds is " + ((currentTime * 9)+8)+" meters");
        }else{
            System.out.println("Distance calculation on " + relaxTime + " seconds is " + ((currentTime * 9)+9)+" meters");
        }

    }

}
