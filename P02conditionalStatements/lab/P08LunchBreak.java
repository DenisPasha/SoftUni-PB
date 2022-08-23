package P02conditionalStatements.lab;

import java.util.Scanner;

public class P08LunchBreak {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int showContTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double timeForRelax = breakInMinutes / 4.0;
        double remainingTime = breakInMinutes - lunchTime - timeForRelax;

        double diff = Math.abs(remainingTime - showContTime);
        if (remainingTime >= showContTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShowName, Math.ceil(diff));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShowName, Math.ceil(diff));
        }
//
//        String serial=scanner.nextLine();
//        int legth= Integer.parseInt(scanner.nextLine());
//        int rest= Integer.parseInt(scanner.nextLine());
//
//        double lunchTime=rest/8;
//        double breakTime=rest/4;
//        double timeLeft=rest-lunchTime-breakTime;
//
//        double  neededTime=Math.abs(legth-timeLeft);
//
//        if (timeLeft>=legth){
//            System.out.printf("You have enough time to watch %s and left with %f minutes free time.",serial,neededTime);
//        }else {
//            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",serial,Math.ceil(neededTime));
//        }


    }
}
