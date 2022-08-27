package P05WhileLoop.Excercise;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int badGradesMax= Integer.parseInt(scanner.nextLine());
        String comand=scanner.nextLine();
        double totalGrades=0;
        int badGradesCount=0;
        boolean tooManyBadGrades=false;
        String lastProblem="";


        double average=0;
        int problemsCount=0;

        while (!comand.equals("Enough")){

            lastProblem=comand;
            double grade= Double.parseDouble(scanner.nextLine());

            problemsCount=problemsCount+1;
            totalGrades=totalGrades+grade;

            if (grade<=4){
                badGradesCount=badGradesCount+1;


            }
            if (badGradesCount==badGradesMax){
                tooManyBadGrades=true;
                break;
            }

            comand=scanner.nextLine();
        }
        average=totalGrades/problemsCount;
        if (tooManyBadGrades){
            System.out.printf("You need a break, %d poor grades.",badGradesMax);
        }else {

            System.out.printf("Average score: %.2f \n",average);
            System.out.printf("Number of problems: %d \n",problemsCount);
            System.out.printf("Last problem: %s ",lastProblem);
        }


    }
}
