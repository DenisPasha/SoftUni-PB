package P03SwitchCase.lab.Exercise;

import java.util.Scanner;

public class P01Cinema {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String projection=scanner.nextLine();
        int r= Integer.parseInt(scanner.nextLine());
        int c= Integer.parseInt(scanner.nextLine());
        double price = 0.00;



        if (projection.equals("Premiere")){
            price=12.00;
        }else if (projection.equals("Normal")){
            price=7.50;
        } else if (projection.equals("Discount")) {
            price=5.00;
        }
        double sum = (r*c)*price;
        System.out.printf("%.2f leva",sum);
    }
}
