package P01firstStepsInCoding.MoreExercises.P01.P02;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double a= Double.parseDouble(scanner.nextLine());
        double b= Double.parseDouble(scanner.nextLine());

        double sum= a * b / 2;

        System.out.printf("%.2f",sum);
    }
}
