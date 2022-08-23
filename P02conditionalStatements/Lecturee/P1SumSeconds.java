package P02conditionalStatements.Lecturee;

import java.util.Scanner;

public class P1SumSeconds {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int timeA= Integer.parseInt(scanner.nextLine());
        int timeB= Integer.parseInt(scanner.nextLine());
        int timeC= Integer.parseInt(scanner.nextLine());

        int totalTime=timeA+timeB+timeC;

        int min=totalTime/60;
        int sec=totalTime%60;

        if(sec<10){
            System.out.printf("%d:0%d",min,sec);
        }else{
            System.out.printf("%d:%d",min, sec);
        }

    }
}
