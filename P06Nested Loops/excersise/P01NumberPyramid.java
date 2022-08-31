package P06NestedLoops.excersise;

import java.util.Scanner;

public class P01NumberPyramid {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int n= Integer.parseInt(scanner.nextLine());
        int num=0;
        boolean enough=false;

        for (int rows=1; rows<=n; rows++){
            for (int cols=1; cols<=rows; cols++){
                num=num+1;


                System.out.print(num+" ");

                if (num==n){
                    enough=true;
                    break;
                }

            }
            if (enough){
                break;
            }
            System.out.println();
        }


    }
}
