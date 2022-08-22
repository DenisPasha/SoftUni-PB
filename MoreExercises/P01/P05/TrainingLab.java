package P01firstStepsInCoding.MoreExercises.P01.P05;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double buro=0.70;
        double buroL=1.20;

        double length= Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());



       double widthWithCoridor=width-1.00;

       int buroCount= (int) (widthWithCoridor/buro);
       int buroLcount= (int) (length/buroL);

       int totalCount=(buroCount*buroLcount)-3;

        System.out.println(totalCount);

    }
}
