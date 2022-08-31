package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P09SumofTwoNumbers {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int numA= Integer.parseInt(scanner.nextLine());
        int numB= Integer.parseInt(scanner.nextLine());
        int magicNum= Integer.parseInt(scanner.nextLine());
        int sum=0;
        int curentNum=0;
        int combination=0;

        boolean isEnough=false;
        int firstCurent=0;
        int secodnCurent=0;



            for (int i=numA; i<=numB; i++){


                for (int j=numA;j<=numB;j++){

                    firstCurent=i;
                    secodnCurent=j;
                    sum=i+j;
                    combination++;

                    if (sum==magicNum){
                        isEnough=true;
                        break;
                    }
                }
                if (isEnough){
                    break;
                }

            }




        if (isEnough){
            System.out.printf("Combination N:%d (%d + %d = %d)",combination,firstCurent,secodnCurent,sum);
        }else {
            System.out.printf("%d combinations - neither equals %d",combination,magicNum);
        }




    }
}
