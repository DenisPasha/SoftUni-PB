package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P11HappyCatParking {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int daysCount= Integer.parseInt(scanner.nextLine());
        int hoursPerDay= Integer.parseInt(scanner.nextLine());

        double sum=0;


        for (int i=1;i<=daysCount; i++){


            double dailySum=0;

            for (int j=1;j<=hoursPerDay; j++){

                if (i%2!=0 && j%2==0){
                    dailySum=dailySum+1.25;
                } else if (i%2==0 && j%2!=0) {
                    dailySum=dailySum+2.50;
                }else {
                    dailySum=dailySum+1.00;
                }

            }


            System.out.printf("Day: %d - %.2f leva",i,dailySum);
            System.out.println();

            sum=sum+dailySum;

        }

        System.out.printf("Total: %.2f leva",sum);



    }
}
