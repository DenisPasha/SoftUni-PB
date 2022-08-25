package P03SwitchCase.lab.lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String city =scanner.nextLine();
        double sales= Double.parseDouble(scanner.nextLine());
        double commission=0.0;


        switch (city){

            case "Sofia":

                if (sales>=0&&sales<=500){
                    commission =0.05;
                    
                } else if (sales>500 && sales<=1000) {
                    commission=0.07;
                } else if (sales>1000 && sales<=10000) {
                    commission=0.08;
                }else if (sales>10000){
                    commission=0.12;
                }else {
                    System.out.println("error");
                }
                break;
            case "Varna":

                if (sales>=0&&sales<=500){
                    commission =0.045;

                } else if (sales>500 && sales<=1000) {
                    commission=0.075;
                } else if (sales>1000 && sales<=10000) {
                    commission=0.10;
                }else if (sales>10000){
                    commission=0.13;
                }else {
                    System.out.println("error");
                }


                break;
            case "Plovdiv":
                if (sales>=0&&sales<=500){
                    commission =0.055;

                } else if (sales>500 && sales<=1000) {
                    commission=0.08;
                } else if (sales>1000 && sales<=10000) {
                    commission=0.12;
                }else if (sales>10000){
                    commission=0.145;
                }else {
                    System.out.println("error");
                }
                break;


            default:
                System.out.println("error");


        }

        double sum=commission*sales;
        if (sum >0){
            System.out.printf("%.2f",sum);
        }



    }
}
