package P04ForLoop.Excercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int sum=0;
        int totalSum=0;
        int max=Integer.MIN_VALUE;


        for (int i =1; i<=n; i++) {

            int num = Integer.parseInt(scanner.nextLine());

            if (num>max){
                max=num;
            }

            sum = sum + num;
            totalSum=sum-max;

        }
        if (totalSum==max){
            System.out.println("Yes");
            System.out.printf("Sum = %d",totalSum);
        }else {
            System.out.println("No");
            int diff= Math.abs(totalSum)-Math.abs(max);
            System.out.printf("Diff = %d",Math.abs(diff));
        }



    }
}
