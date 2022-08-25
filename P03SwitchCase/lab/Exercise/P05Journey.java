package P03SwitchCase.lab.Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        double budget= Double.parseDouble(scanner.nextLine());
        String season=scanner.nextLine();
        String destination="";
        String place="";
        double moneySpend=0.00;


        if (budget<=100){
            destination="Bulgaria";
            if (season.equals("summer")){
                place="Camp";
                 moneySpend=budget*0.30;
            }else {
                place="Hotel";
                 moneySpend=budget*0.70;
            }
            
        } else if (budget>100 && budget<=1000) {
            destination="Balkans";
            if (season.equals("summer")){
                place="Camp";
                moneySpend=budget*0.40;
            }else {
                place="Hotel";
                 moneySpend=budget*0.80;
            }
            
        } else if (budget>1000) {
            destination="Europe";
            place="Hotel";
            moneySpend=budget*0.90;
            
        }

        System.out.printf("Somewhere in %s \n",destination);
        System.out.printf("%s - %.2f",place,moneySpend);


    }
}
