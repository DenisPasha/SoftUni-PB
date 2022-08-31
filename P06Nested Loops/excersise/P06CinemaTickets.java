package P06NestedLoops.excersise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String input=scanner.nextLine();

        int input2Count=0;
        int studentCount=0;
        int standartCount=0;
        int kidCount=0;
        int totalTicketsAll=0;

        int totalStudentTickets=0;
        int totalStandartTickets=0;
        int totalKidTickets=0;


        boolean isFinish=false;


        while (!input.equals("Finish")){

            String movie=input;
          int  freeTickets= Integer.parseInt(scanner.nextLine());
            String input2=scanner.nextLine();


            while (!input2.equals("End")){


                if (input2.equals("Finish")){
                    isFinish=true;
                    break;
                }

                input2Count=input2Count+1;
                totalTicketsAll=totalTicketsAll+1;


                if (input2Count<=freeTickets){

                    if (input2.equals("student")){
                        studentCount=studentCount+1;
                        totalStudentTickets=totalStudentTickets+1;
                    } else if (input2.equals("standard")) {
                        standartCount=standartCount+1;
                        totalStandartTickets=totalStandartTickets+1;
                    } else if (input2.equals("kid")) {
                        kidCount=kidCount+1;
                        totalKidTickets=totalKidTickets+1;
                    }

                }
                input2=scanner.nextLine();
            }
            double avalableTickets=freeTickets*1.0;
            double totalTickets=(standartCount+studentCount+kidCount)/(avalableTickets/100);


            System.out.printf("%s - %.2f%% full.\n",movie,totalTickets);
            input2Count=0;
            standartCount=0;
            studentCount=0;
            kidCount=0;

            if (isFinish){
                System.out.printf("Total tickets: %d\n",totalTicketsAll);
                double stTickets=totalStudentTickets*1.0/totalTicketsAll*100;
                System.out.printf("%.2f%% student tickets.\n",stTickets);
                double standTickets=totalStandartTickets*1.0/totalTicketsAll*100;
                System.out.printf("%.2f%% standard tickets.\n",standTickets);
                double kidTickets=totalKidTickets*1.0/totalTicketsAll*100;
                System.out.printf("%.2f%% kids tickets.",kidTickets);
            }

            input=scanner.nextLine();

        }




        System.out.println(studentCount);
        System.out.println(standartCount);
        System.out.println(kidCount);



    }
}
