package P04ForLoop.Excercise;

import java.util.Scanner;

public class P03Histogram {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int lessThen200=0;
        int lessThen400=0;
        int lessThen600=0;
        int lessThen800=0;
        int moreThen800=0;

        for (int i =1; i<=n; i++){
            int num= Integer.parseInt(scanner.nextLine());

            if (num<200){

                lessThen200=lessThen200+1;
            } else if (num >=200 && num<=399) {
                lessThen400=lessThen400+1;
            } else if (num >= 400 && num <=599) {
                lessThen600=lessThen600+1;
            } else if (num>=600 && num<=799) {
                lessThen800=lessThen800+1;
            }else {
                moreThen800=moreThen800+1;
            }
        }

        double p1=lessThen200*1.0/n*100;
        double p2=lessThen400*1.0/n*100;
        double p3=lessThen600*1.0/n*100;
        double p4=lessThen800*1.0/n*100;
        double p5=moreThen800*1.0/n*100;
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
        System.out.printf("%.2f%%\n",p4);
        System.out.printf("%.2f%%\n",p5);



    }
}
