package P04ForLoop.Excercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        int tabs= Integer.parseInt(scanner.nextLine());
        int salary= Integer.parseInt(scanner.nextLine());

        int facebookTicket=0;
        int instagramTicket=0;
        int reditTicket=0;


        for (int i=1; i<=tabs; i++){
            String site=scanner.nextLine();

            switch (site){

                case "Facebook":
                    facebookTicket=facebookTicket+150;
                    break;
                case "Instagram":
                    instagramTicket=instagramTicket+100;
                    break;
                case "Reddit":
                    reditTicket=reditTicket+50;
                    break;
            }

        }
        int totalLostMoney=facebookTicket+instagramTicket+reditTicket;
        if (salary>totalLostMoney){
            System.out.println(salary-totalLostMoney);
        }else {
            System.out.printf("You have lost your salary.");
        }

    }
}
