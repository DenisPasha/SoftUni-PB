package P06NestedLoops.lab;

import java.util.Scanner;

public class P05Travelling{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();



        while (!input.equals("End")){
            String destination=input;
            double budjet= Double.parseDouble(scanner.nextLine());

            double sum=0;

            while (sum<budjet){
                double amountt= Double.parseDouble(scanner.nextLine());
                sum=sum+amountt;
            }
            System.out.printf("Going to %s!\n",destination);


            input=scanner.nextLine();
        }


    }
}
