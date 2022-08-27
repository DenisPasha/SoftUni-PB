package P05WhileLoop.lab;

import java.util.Scanner;

public class P05AccountBalance {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        String input= scanner.nextLine();
        double sumInCard=0;
        double min=0;

        while (!input.equals("NoMoreMoney")){
            double amount= Double.parseDouble(input);

            if (amount<0){
                System.out.println("Invalid operation!");
                break;
            }

            sumInCard=sumInCard+amount;
            System.out.printf("Increase: %.2f\n",amount);
            input=scanner.nextLine();


        }


        System.out.printf("Total: %.2f",sumInCard);



    }
}
