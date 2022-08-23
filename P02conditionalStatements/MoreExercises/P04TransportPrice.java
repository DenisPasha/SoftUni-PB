package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int kilometersCount= Integer.parseInt(scanner.nextLine());
        String dayOrNight=scanner.nextLine();


        double startingPrice=0;
        if (kilometersCount<20){
            if (dayOrNight.equals("night")){
                 startingPrice=0.90;
            }else if (dayOrNight.equals("day")){
                 startingPrice=0.79;
            }
            double price=0.70+(kilometersCount*startingPrice);
            System.out.printf("%.2f",price);


        }else if (kilometersCount>20 && kilometersCount<100) {

            double price=kilometersCount*0.09;

            System.out.printf("%.2f",price);
        } else {
            double price=kilometersCount*0.06;
            System.out.printf("%.2f",price);

            
        }
    }
}
