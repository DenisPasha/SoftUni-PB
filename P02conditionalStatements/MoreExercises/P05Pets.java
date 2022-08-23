package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {



        Scanner scanner=new Scanner(System.in);

        int days= Integer.parseInt(scanner.nextLine());
        int foodInKg= Integer.parseInt(scanner.nextLine());
        double foodForDog= Double.parseDouble(scanner.nextLine());
        double foodForCat= Double.parseDouble(scanner.nextLine());
        double foodForTurtle= Double.parseDouble(scanner.nextLine());
        double foodTurtle=foodForTurtle/1000;


        double neededFoodForDog=days*foodForDog;
        double neededFoodForCat=days*foodForCat;
        double neededFoodForTurtle=foodTurtle*days;


        double totalFood=neededFoodForDog+neededFoodForCat+neededFoodForTurtle;

        if (foodInKg>totalFood){
            double diff=foodInKg-totalFood;
            System.out.printf("%.0f kilos of food left.",Math.floor(diff));
        }else {
            double diff= totalFood-foodInKg;
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }
    }
}
