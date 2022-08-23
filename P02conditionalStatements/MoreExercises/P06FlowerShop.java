package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int magnoliaCount= Integer.parseInt(scanner.nextLine());
        int zumulCount= Integer.parseInt(scanner.nextLine());
        int roseCount= Integer.parseInt(scanner.nextLine());
        int cactusCount= Integer.parseInt(scanner.nextLine());
        double pricePresent= Double.parseDouble(scanner.nextLine());



        double sum= magnoliaCount*3.25+zumulCount*4.00+roseCount*3.50+cactusCount*8.00;

        double sumAfterTax=sum-sum*0.05;
        if (pricePresent>sumAfterTax){

            double total=pricePresent-sumAfterTax;


            System.out.printf("She will have to borrow %.0f leva.",Math.ceil(total));
        }else {
            double total=sumAfterTax-pricePresent;
            System.out.printf("She is left with %.0f leva.",Math.floor(total));
        }


    }
}
