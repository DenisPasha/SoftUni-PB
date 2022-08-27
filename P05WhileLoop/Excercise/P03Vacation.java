package P05WhileLoop.Excercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        double moneyNeeded= Double.parseDouble(scanner.nextLine());
        double moneyAvailable= Double.parseDouble(scanner.nextLine());
        double totalMoney=moneyAvailable;
        int totalDays=0;
        int spendingDays=0;
        boolean cantSaveMoney=false;

        while (totalMoney<moneyNeeded){

            String text=scanner.nextLine();
            double money= Double.parseDouble(scanner.nextLine());

            switch (text){
                case "save":
                    totalMoney=totalMoney+money;
                    spendingDays=0;
                    totalDays=totalDays+1;

                    break;
                case "spend":
                    totalMoney=totalMoney-money;

                    spendingDays=spendingDays+1;
                    totalDays=totalDays+1;
                    if (totalMoney<0){
                        totalMoney=0;
                    }
                    break;

            }

            if (spendingDays==5){
                cantSaveMoney=true;
                break;

            }



        }

        if (cantSaveMoney){
            System.out.printf("You can't save the money.\n");
            System.out.printf("%d",totalDays);
        }else {
            System.out.printf("You saved the money for %d days.",totalDays);
        }





    }
}
