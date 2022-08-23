package P02conditionalStatements.lab;

import java.util.Scanner;

public class P06WorldSwimmingRecord {


    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        double recordInSeconds= Double.parseDouble(scanner.nextLine());
        double distanceInMeters= Double.parseDouble(scanner.nextLine());
        double secondsSwim1Meter= Double.parseDouble(scanner.nextLine());

        double mustSwim=distanceInMeters*secondsSwim1Meter;
        double resistance=Math.floor(distanceInMeters/15);
        double resistanceFinal=resistance*12.5;

        double totalTime=mustSwim+resistanceFinal;

        double secondsDifference=mustSwim-resistanceFinal;

        if (recordInSeconds<totalTime){
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(secondsDifference));
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",totalTime);
        }


    }
}
