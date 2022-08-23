package P02conditionalStatements.Lecturee;

import java.util.Scanner;

public class P7AreaofFigures {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String square="square";
        String rectangle="rectangle";
        String circle="circle";
        String triangle="triangle";

        String input=scanner.nextLine();

        if (input.equals(square)){
            double squareLength= Double.parseDouble(scanner.nextLine());

            double squareResult=squareLength*squareLength;
            System.out.printf("%.3f",squareResult);

        }if(input.equals(rectangle)){
            double rectangleLengthA= Double.parseDouble(scanner.nextLine());
            double rectangleLengthB= Double.parseDouble(scanner.nextLine());

            double rectangleResult=rectangleLengthA*rectangleLengthB;
            System.out.printf("%.3f",rectangleResult);


        }if(input.equals(circle)){
            double circleRadius= Double.parseDouble(scanner.nextLine());

            double circleRadiusResult=Math.PI*(circleRadius*circleRadius);
            System.out.printf("%.3f",circleRadiusResult);

        }if(input.equals(triangle)){
            double triangleLegth= Double.parseDouble(scanner.nextLine());
            double triangleHeight= Double.parseDouble(scanner.nextLine());

            double triangleResult=triangleHeight*triangleLegth/2;
            System.out.printf("%.3f",triangleResult);

        }
    }
}
