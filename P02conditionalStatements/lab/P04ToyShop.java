package P02conditionalStatements.lab;

import java.util.Scanner;

public class P04ToyShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double puzzle=2.60;
        double kukla=3.00;
        double meche=4.10;
        double minion=8.20;
        double kamionche=2.00;

        double ekskurzia= Double.parseDouble(scanner.nextLine());
        int puzzleCount= Integer.parseInt(scanner.nextLine());
        int kukliCount= Integer.parseInt(scanner.nextLine());
        int mechetaCount= Integer.parseInt(scanner.nextLine());
        int minioniCount= Integer.parseInt(scanner.nextLine());
        int kamionchetaCount= Integer.parseInt(scanner.nextLine());

        double sum=puzzleCount*puzzle+kukliCount*kukla+mechetaCount*meche+
                minioniCount*minion+kamionchetaCount*kamionche;


        int totalCount=puzzleCount+kukliCount+mechetaCount+minioniCount+kamionchetaCount;
        if (totalCount>=50){
            sum=sum-(sum*0.25);
        }
        double lastSum= sum-sum*0.10;

        double moneyLeft=lastSum-ekskurzia;
        if (lastSum>=ekskurzia){
            System.out.printf("Yes! %.2f lv left.",moneyLeft);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(moneyLeft));
        }

    }
}
