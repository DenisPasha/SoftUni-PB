package P01firstStepsInCoding.MoreExercises.P01.P06;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double mackrelPrice= Double.parseDouble(scanner.nextLine());
        double cacaPrice= Double.parseDouble(scanner.nextLine());
        double palamudKg= Double.parseDouble(scanner.nextLine());
        double safrid= Double.parseDouble(scanner.nextLine());
        double midi= Double.parseDouble(scanner.nextLine());

        double palamudPrice=mackrelPrice*1.6;
        double safridPrice=cacaPrice*1.80;
        double midiPrice=7.50;

        double palamudSum=palamudKg*palamudPrice;
        double safridSum=safrid*safridPrice;
        double midiSum=midi*midiPrice;
        double total=palamudSum+safridSum+midiSum;

        System.out.printf("%.2f",total);



    }
}
