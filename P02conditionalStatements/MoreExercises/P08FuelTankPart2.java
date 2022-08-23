package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08FuelTankPart2 {

    public static void main(String[] args) {
        //•	Бензин – 2.22 лева за един литър,
        //•	Дизел – 2.33 лева за един литър
        //•	Газ – 0.93 лева за литър
        Scanner scanner = new Scanner(System.in);

        //•	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        //•	Количество гориво – реално число в интервала [1.00 … 50.00]
        //•	Притежание на клубна карта – текст с възможности: "Yes" или "No"

        String fuelType=scanner.nextLine();
        double ammountFuel= Double.parseDouble(scanner.nextLine());
        String clubCard=scanner.nextLine();

        if (fuelType.equals("Gas")||fuelType.equals("Gasoline")||fuelType.equals("Diesel")){


            double fuelPrice=0;


            if (fuelType.equals("Gas")){
                fuelPrice=0.93;

                if (clubCard.equals("Yes")){

                    fuelPrice=fuelPrice-0.08;

                } else if (clubCard.equals("No")) {

                    fuelPrice=fuelPrice-0.00;

                }


            } else if (fuelType.equals("Gasoline")) {
                fuelPrice=2.22;

                if (clubCard.equals("Yes")){

                    fuelPrice=fuelPrice-0.18;
                } else if (clubCard.equals("No")) {

                    fuelPrice=fuelPrice-0.00;

                }

                
            } else if (fuelType.equals("Diesel")) {
                 fuelPrice=2.33;

                if (clubCard.equals("Yes")){

                    fuelPrice=fuelPrice-0.12;


                } else if (clubCard.equals("No")) {

                    fuelPrice=fuelPrice-0.00;

                }

            }


            double sum=fuelPrice*ammountFuel;

            if (ammountFuel>25){

                sum=sum-sum*0.10;
                System.out.printf("%.2f lv.",sum);

            }else if (ammountFuel>=20 && ammountFuel<=25){

                sum=sum-sum*0.08;

                System.out.printf("%.2f lv.",sum);
            }else {
                sum=sum;
                System.out.printf("%.2f lv.",sum);
            }


        }else {
            System.out.printf("");
        }





    }
}
