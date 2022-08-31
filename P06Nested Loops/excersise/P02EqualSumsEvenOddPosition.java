package P06NestedLoops.excersise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        int num1= Integer.parseInt(scanner.nextLine());
        int num2= Integer.parseInt(scanner.nextLine());

        for (int i=num1; i<=num2; i++){

            int curentNum=i;
            int evenSum=0;
            int oddSum=0;

            for (int j=6; j>=1; j--){

                int digit=curentNum%10;
                if (j%2==0){
                    evenSum=evenSum+digit;
                }else {
                    oddSum=oddSum+digit;
                }
                curentNum=curentNum/10;

            }
            if (evenSum==oddSum){
                System.out.print(i+" ");
            }
        }


    }
}
