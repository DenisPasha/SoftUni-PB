package P06NestedLoops.excersise;

import java.util.Scanner;

public class P04TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number= Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int counter=0;
        double averageGrade=0;
        double allGradesSum=0;

        while (!input.equals("Finish")){
            String presenttion=input;


            double sumCurentGrades=0;

            for (int i=1; i<=number; i++){
                double curentGrade= Double.parseDouble(scanner.nextLine());
                sumCurentGrades=sumCurentGrades+curentGrade;
                counter=counter+1;


            }
            double averageCurentGrade=sumCurentGrades/number;
            System.out.printf("%s - %.2f.\n",presenttion,averageCurentGrade);

             averageGrade=sumCurentGrades/counter;
             allGradesSum=allGradesSum+sumCurentGrades;


            input=scanner.nextLine();
        }

        double finalGrade=allGradesSum/counter;
        System.out.printf("Student's final assessment is %.2f.",finalGrade);



    }
}
