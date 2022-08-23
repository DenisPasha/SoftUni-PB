package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P02SleepyTomCat {

    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int restDays= Integer.parseInt(scanner.nextLine());

        int restDayshours=restDays*127;
        int workingDaysHours=(365-restDays)*63;

        int totalPlayingTime=restDayshours+workingDaysHours;


        int diff=30000-totalPlayingTime;


        int hours=diff/60;
        int min=diff%60;

        if (totalPlayingTime<30000){
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,min);

        }else {
            int overTime=totalPlayingTime-30000;
            int hoursOver=overTime/60;
            int minOver=overTime%60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hoursOver,minOver);
        }

    }
}
