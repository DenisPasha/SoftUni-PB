package P01firstStepsInCoding.MoreExercises.P01.P02.P03;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double celsius= Double.parseDouble(scanner.nextLine());

        double f=1.8*celsius+32;

        System.out.printf("%.2f",f);



    }
}
