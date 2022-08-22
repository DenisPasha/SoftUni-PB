package P01firstStepsInCoding.lab;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Брой пакети химикали - цяло число в интервала [0...100]
        int pens = Integer.parseInt(scanner.nextLine());

        //•	Брой пакети маркери - цяло число в интервала [0...100]
        int markers = Integer.parseInt(scanner.nextLine());

        //•	Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        int litersPrep = Integer.parseInt(scanner.nextLine());

        //•	Процент намаление - цяло число в интервала [0...100]
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceBeforeDiscount = pens * 5.80 + markers * 7.20 + litersPrep * 1.20;
        double finalPrice = priceBeforeDiscount - (priceBeforeDiscount * percentDiscount / 100);

        System.out.println(finalPrice);
    }
}
