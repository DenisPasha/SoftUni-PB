package P01firstStepsInCoding.lab;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chickenMenu = Integer.parseInt(scanner.nextLine());//чета броя пилешки менюта
        int fishMenu = Integer.parseInt(scanner.nextLine());//чета броя менюта с риба
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());// чета броя на вегетарианските мета

        double priceForChicken = chickenMenu * 10.35; //намираме цената на пилешките менюта
        double priceForFish = fishMenu * 12.40; //намираме цената на рибните менюта
        double priceForVegetarian = vegetarianMenu * 8.15; //намираме цената на вег. менюта

        double priceAllMenus = priceForChicken + priceForFish + priceForVegetarian;

        //намираме цената на десерите
        double priceDesert = priceAllMenus * 20 / 100; // priceAllMenus * 0.20

        double totalPrice = priceAllMenus + priceDesert + 2.50;

        System.out.println(totalPrice);
    }
}
