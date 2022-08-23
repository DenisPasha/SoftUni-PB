package P02conditionalStatements.MoreExercises;

import java.util.Scanner;

public class P01PipesInPool {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);


        int v= Integer.parseInt(scanner.nextLine());
        int P1= Integer.parseInt(scanner.nextLine());
        int P2= Integer.parseInt(scanner.nextLine());
        double H= Double.parseDouble(scanner.nextLine());

        double P1debit1Hour=P1*H;
        double P2debit1Hour=P2*H;

        double totalDebit=P1debit1Hour+P2debit1Hour;
        double V=v*1.0;

        double totalPoolPercentage= totalDebit/v*100;


        double P1Percentage=(P1debit1Hour/totalDebit)*100;
        double P2Percentage=(P2debit1Hour/totalDebit)*100;




        if(totalDebit>v){
            double overflow=totalDebit-v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",H,overflow);
        }else{



            System.out.printf("The pool is %.2f %% full Pipe 1: %.2f %%. Pipe 2: %.2f %%.",totalPoolPercentage,P1Percentage,P2Percentage);
        }


    }
}
