package P04ForLoop.Excercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int tournirCount= Integer.parseInt(scanner.nextLine());
        int ranglistPoints= Integer.parseInt(scanner.nextLine());
        int pointsAwarded=0;
        int winRate=0;

        for (int i=1; i<=tournirCount; i++){
            String phaseOfTournir=scanner.nextLine();

            if (phaseOfTournir.equals("W")){
                pointsAwarded=pointsAwarded+2000;
                winRate=winRate+1;

            } else if (phaseOfTournir.equals("F")) {
                pointsAwarded=pointsAwarded+1200;
            } else if (phaseOfTournir.equals("SF")) {
                pointsAwarded=pointsAwarded+720;
            }

        }

        double averagePoints=(pointsAwarded*1.0)/tournirCount;
        double percentage=winRate*1.0/tournirCount*100;
        pointsAwarded=pointsAwarded+ranglistPoints;


        System.out.printf("Final points: %d\n",pointsAwarded);
        System.out.printf("Average points: %.0f\n",Math.floor(averagePoints));
        System.out.printf("%.2f%%",percentage);

    }
}
