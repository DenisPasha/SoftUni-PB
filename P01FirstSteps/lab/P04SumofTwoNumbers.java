package P06NestedLoops.lab;

import java.util.Scanner;

public class P04SumofTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());
        int sumWeWant= Integer.parseInt(scanner.nextLine());
        int count=0;

        boolean yesCombination=false;


        for (int i=a; i<=b; i++){
            for (int j=a; j<=b; j++){
                count=count+1;
                int sum=i+j;
                if (sum==sumWeWant){
                    yesCombination=true;
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,sumWeWant);

                    break;
                }


            }
            if (yesCombination){
                break;
            }



        }

        if (!yesCombination){
            System.out.printf("%d combinations - neither equals %d",count,sumWeWant);

        }


    }
}
