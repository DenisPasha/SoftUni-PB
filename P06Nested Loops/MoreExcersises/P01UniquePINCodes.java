package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        int upperLimitFirstDigit= Integer.parseInt(scanner.nextLine());
        int upperLimitSecondDigit= Integer.parseInt(scanner.nextLine());
        int upperLimitThirdDigit= Integer.parseInt(scanner.nextLine());


        for (int i = 2; i<=upperLimitFirstDigit; i+=2){


            for (int j=1; j<=upperLimitSecondDigit; j++){


                for (int l=2; l<=upperLimitThirdDigit; l+=2){



                    if ( j!=1&& j!=4){
                        System.out.printf("%d %d %d",i,j,l);
                        System.out.println();


                    }



                }
            }
        }


    }
}
