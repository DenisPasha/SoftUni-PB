package P04ForLoop.lab;

import java.util.Scanner;

public class P08Numbersequence {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        int maxNum=Integer.MAX_VALUE;
        int minNum=Integer.MIN_VALUE;


        for (int i=1 ; i<=n;i++){

            int num= Integer.parseInt(scanner.nextLine());

            if (num>minNum){
                minNum=num;
            }if (num<maxNum){
                maxNum=num;
            }

        }
        System.out.printf("Max number: %d%n", minNum);
        System.out.printf("Min number: %d%n", maxNum);



    }
}
