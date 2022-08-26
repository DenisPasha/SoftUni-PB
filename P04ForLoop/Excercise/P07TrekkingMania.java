package P04ForLoop.Excercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int groupCount= Integer.parseInt(scanner.nextLine());

        int totalPeople=0;
        int musala=0;
        int monblan=0;
        int kilimandjaro=0;
        int k22=0;
        int everestt=0;

        for (int i=1; i<=groupCount; i++){
            int peopleInGroup= Integer.parseInt(scanner.nextLine());

            for (int n=1; n<=peopleInGroup; n++){
                totalPeople=totalPeople+1;
            }
            if (peopleInGroup<=5){
                musala=musala+peopleInGroup;
            } else if (peopleInGroup>=6 &&peopleInGroup<=12) {
                monblan=monblan+peopleInGroup;
            } else if (peopleInGroup>12 && peopleInGroup<=25) {
                kilimandjaro=kilimandjaro+peopleInGroup;
            } else if (peopleInGroup>25 && peopleInGroup<=40) {
                k22=k22+peopleInGroup;
            } else if (peopleInGroup >40 ) {
                everestt=everestt+peopleInGroup;
            }


        }


        double musalaClimbers=musala*1.0/totalPeople*100;
        double monblanClimbers=monblan*1.0/totalPeople*100;
        double kilimandjaroClimbers=kilimandjaro*1.0/totalPeople*100;
        double k22Climbers=k22*1.0/totalPeople*100;
        double everestClimbers=everestt*1.0/totalPeople*100;

        System.out.printf("%.2f%%\n",musalaClimbers);
        System.out.printf("%.2f%%\n",monblanClimbers);
        System.out.printf("%.2f%%\n",kilimandjaroClimbers);
        System.out.printf("%.2f%%\n",k22Climbers);
        System.out.printf("%.2f%%\n",everestClimbers);



    }
}
