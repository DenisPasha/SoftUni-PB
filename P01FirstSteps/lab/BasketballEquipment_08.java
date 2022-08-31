package P01firstStepsInCoding.lab;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tax = Double.parseDouble(scanner.nextLine());

        //намираме цената на кецовете
        double sneakersPrice = tax - (tax * 0.40);
        //намираме цената на екипа
        double uniformPrice = sneakersPrice - (sneakersPrice * 0.20);
        //намираме цеанта на топката
        double ballPrice = uniformPrice / 4;
        //намираме цената на аксесоарите
        double accessories = ballPrice / 5;

        double totalPrice = tax + sneakersPrice + uniformPrice + ballPrice + accessories;

        System.out.println(totalPrice);
    }
}
