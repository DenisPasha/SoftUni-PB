package P02conditionalStatements.lab;

import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int hours= Integer.parseInt(scanner.nextLine());
        int minutes= Integer.parseInt(scanner.nextLine());

        int totalMin=hours*60+minutes+15;

        hours=totalMin/60;
        minutes=totalMin%60;


        if (hours>23){
            hours=0;
        }

        if(minutes<10){
            System.out.printf("%d:0%d",hours,minutes);
        }else {
            System.out.printf("%d:%d",hours,minutes);
        }
    }
}
