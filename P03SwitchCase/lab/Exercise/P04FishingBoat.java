package P03SwitchCase.lab.Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int budget= Integer.parseInt(scanner.nextLine());
        String season=scanner.nextLine();
        int fishersCount= Integer.parseInt(scanner.nextLine());

        //•	Цената за наем на кораба през пролетта е  3000 лв.
        //•	Цената за наем на кораба през лятото и есента е  4200 лв.
        //•	Цената за наем на кораба през зимата е  2600 лв.
        double boatPrice=0.00;
        double total=0.00;
        double additioinalDiscount=0.05;
        double sum=0.00;

        switch (season){


            case "Summer":
            case "Autumn":

                boatPrice=4200;

                break;
            case "Winter":
                boatPrice=2600;
                break;

            case "Spring":
                boatPrice=3000;
                break;


        }

        if (fishersCount>=12){
            sum=boatPrice- boatPrice*0.25;
        } else if (fishersCount>=7) {
            sum=boatPrice- boatPrice*0.15;
        }else {
            sum=boatPrice- boatPrice*0.10;
        }

        if (fishersCount %2==0 && !season.equals("Autumn")) {

            sum=sum-sum*additioinalDiscount;

        }


        if (budget>=sum){
            double diff=budget-sum;
            System.out.printf("Yes! You have %.2f leva left.",diff);
        } else if (sum>budget) {
            double diff=sum-budget;
            System.out.printf("Not enough money! You need %.2f leva.",diff);

        }


    }
}
