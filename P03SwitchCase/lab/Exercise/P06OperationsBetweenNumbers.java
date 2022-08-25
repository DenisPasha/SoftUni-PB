package P03SwitchCase.lab.Exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);

        int n1= Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String symbol=scanner.nextLine();


        if (symbol.equals("+")){
            int sum=n1+n2;
            if (sum % 2==0){
                System.out.printf("%d %s %d = %d - even",n1,symbol,n2,sum);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,symbol,n2,sum);
            }
        }

        if (symbol.equals("-")){
            int sum=n1-n2;
            if (sum % 2==0){
                System.out.printf("%d %s %d = %d - even",n1,symbol,n2,sum);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,symbol,n2,sum);
            }
        }

        if (symbol.equals("*")){
            int sum=n1*n2;
            if (sum % 2==0){
                System.out.printf("%d %s %d = %d - even",n1,symbol,n2,sum);
            }else {
                System.out.printf("%d %s %d = %d - odd",n1,symbol,n2,sum);
            }
        }

        if (symbol.equals("/")){
            if (n2==0){
                System.out.printf("Cannot divide %d by zero",n1);
            }else {
                double sum=n1*1.0/n2;
                System.out.printf("%d / %d = %.2f",n1,n2,sum);
            }

        }

        if (symbol.equals("%")){
            if (n1==0||n2==0){
                System.out.printf("Cannot divide %d by zero",n1);
            }else {
                int sum=n1%n2;
                System.out.printf("%d %% %d = %d",n1,n2,sum);
            }

        }




    }
}
