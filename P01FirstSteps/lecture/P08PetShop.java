package P01firstStepsInCoding.lecture;

import java.util.Scanner;

public class P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsCount = Integer.parseInt(scanner.nextLine());
        int catsCount = Integer.parseInt(scanner.nextLine());

        double result = (dogsCount * 2.5) + (catsCount * 4);

        System.out.println(result + " lv.");
    }
}
