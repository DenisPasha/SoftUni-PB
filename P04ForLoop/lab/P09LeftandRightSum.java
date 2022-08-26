package P04ForLoop.lab;

import java.util.Scanner;

public class P09LeftandRightSum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int firstSum=0;
        int secondSum=0;

        for (int i =1; i<=n ; i++){

            int num= Integer.parseInt(scanner.nextLine());
            firstSum=firstSum+num;
        }
        for (int i =1; i<=n ; i++){

            int num= Integer.parseInt(scanner.nextLine());
            secondSum=secondSum+num;
        }
        if (firstSum==secondSum){
            System.out.printf("Yes, sum = %d",firstSum);
        }else if (firstSum>secondSum){
            int diff= firstSum-secondSum;
            System.out.printf(" No, diff = %d",diff);
        } else if (secondSum>firstSum) {
            int diff= secondSum-firstSum;
            System.out.printf(" No, diff = %d",diff);
        }


    }
}
