package P02conditionalStatements.lab;

import java.util.Scanner;

public class P05GodzillavsKong {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        double budget= Double.parseDouble(scanner.nextLine());
        int statistCount= Integer.parseInt(scanner.nextLine());
        double priceClothesStatist= Double.parseDouble(scanner.nextLine());

        double discount;
        double decor= budget*0.10;
        if(statistCount>150){
            priceClothesStatist=priceClothesStatist-priceClothesStatist*0.10;
        }

        double total =statistCount*priceClothesStatist+decor;
        double sum=statistCount*priceClothesStatist;

        double lastSum=budget-total;



        if(budget>decor+sum){
        System.out.println("Action!");
        System.out.printf("Wingard starts filming with %.2f leva left.",Math.abs(lastSum));
    }
    else {
        System.out.println("Not enough money!");
        System.out.printf("Wingard needs %.2f leva more.",Math.abs(lastSum));
    }

    }
}
