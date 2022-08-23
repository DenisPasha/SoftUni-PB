package P02conditionalStatements.lab;

import java.util.Scanner;

public class P07Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget= Double.parseDouble(scanner.nextLine());
        int videoCards= Integer.parseInt(scanner.nextLine());
        int processors= Integer.parseInt(scanner.nextLine());
        int ram= Integer.parseInt(scanner.nextLine());

        double discound=0;


        double videoCardsSum=videoCards*250.00;

        double processorSum=processors*videoCardsSum*0.35;
        double ramSum=ram*videoCardsSum*0.10;

        double totalSum=videoCardsSum+processorSum+ramSum;

        if (videoCards>processors){

            discound=totalSum*0.15;
        }
        totalSum=totalSum-discound;


        double leftMoney=Math.abs(totalSum-budget);

        if (totalSum>=budget){
            System.out.printf("You have %.2f leva left!",leftMoney);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",leftMoney);
        }

    }
}
