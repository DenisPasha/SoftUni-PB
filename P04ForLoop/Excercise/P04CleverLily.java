package P04ForLoop.Excercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int age= Integer.parseInt(scanner.nextLine());
        double washingMachinePrice= Double.parseDouble(scanner.nextLine());
        int toyPrice= Integer.parseInt(scanner.nextLine());

        int toyCount=0;


        double money=0;
        double allMoney=0;
        int moneyYears=0;


        for (int i=1; i<=age; i++){

            if (i%2==0){

                money=money+10;
                allMoney=allMoney+money;
                moneyYears=moneyYears+1;
            }else {
                toyCount=toyCount+1;

            }

        }

        double moneyFromToys=toyCount*toyPrice;
        double moneyAfterBtoyher=allMoney-moneyYears;
        double totalMoney= moneyAfterBtoyher+moneyFromToys;

        if (totalMoney>=washingMachinePrice){
            double diff=totalMoney-washingMachinePrice;
            System.out.printf("Yes! %.2f",diff);
        }else {
            double diff=washingMachinePrice-totalMoney;
            System.out.printf("No! %.2f",diff);
        }



    }
}
