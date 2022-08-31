package P01firstStepsInCoding.MoreExercises.P01.P02.P03.P04;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double zelKgPrice= Double.parseDouble(scanner.nextLine());
        double fruitKgPrice= Double.parseDouble(scanner.nextLine());
        int zelKg = Integer.parseInt(scanner.nextLine());
        int fruitKg = Integer.parseInt(scanner.nextLine());

        double sumForZel=zelKg*zelKgPrice;
        double sumForFuit=fruitKg*fruitKgPrice;

        double totalSum=sumForFuit+sumForZel;
        double endSum=totalSum/1.94;

        System.out.printf("%.2f",endSum);
    }
}
