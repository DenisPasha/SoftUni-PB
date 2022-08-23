package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P03Harvest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int xsquareMeters= Integer.parseInt(scanner.nextLine());
        double ygrapePerSquare= Double.parseDouble(scanner.nextLine());
        int zneededWineLiters= Integer.parseInt(scanner.nextLine());
        int workers= Integer.parseInt(scanner.nextLine());

        double totalGrapes=xsquareMeters*ygrapePerSquare;
        double wine= (0.4*totalGrapes/2.5);

        if (wine>zneededWineLiters){
            double leftWine=wine-zneededWineLiters;
            double winePerPerson=leftWine/workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n",Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.",Math.ceil(leftWine), Math.ceil(winePerPerson));


        }else {
            double neededWine=zneededWineLiters-wine;

            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",Math.floor(neededWine));
        }
    }
}
