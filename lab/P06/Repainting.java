package P01firstStepsInCoding.lab.P06;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        double plastic=1.50;
        double paint=14.50;
        double thine=5.00;

        int plasticInput= Integer.parseInt(scanner.nextLine());
        int paintInput= Integer.parseInt(scanner.nextLine());
        int thineInput= Integer.parseInt(scanner.nextLine());
        int hoursInput= Integer.parseInt(scanner.nextLine());

        double plasticSum=(plasticInput+2)*plastic;
        double paintSum=(paintInput*1.1)*paint;
        double thinerSum=thineInput*thine;

        double materialsSum=plasticSum+paintSum+thinerSum+0.40;
        double labourSum=(materialsSum*0.30)*hoursInput;
        double total=labourSum+materialsSum;

        System.out.println(total);

    }

}
