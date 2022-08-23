package P02conditionalStatements.lab;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int timeA= Integer.parseInt(scanner.nextLine());
        int timeB= Integer.parseInt(scanner.nextLine());
        int timeC= Integer.parseInt(scanner.nextLine());

        int totalTime=timeA+timeB+timeC;

        int minutes=totalTime/60;
        int seconds=totalTime%60;

        if (seconds<10){
            System.out.printf("%d:0%d",minutes,seconds);
        }
        else
        System.out.printf("%d:%d",minutes,seconds);
    }
}
