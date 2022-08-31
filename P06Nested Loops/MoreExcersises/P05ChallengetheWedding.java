package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P05ChallengetheWedding {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        int manCount= Integer.parseInt(scanner.nextLine());
        int womenCount= Integer.parseInt(scanner.nextLine());
        int tablesCount= Integer.parseInt(scanner.nextLine());
        int count=0;
        boolean isFull=false;

        for (int i=1; i<=manCount; i++){

            for (int j=1; j<=womenCount;j++){

                System.out.printf("(%d <-> %d)"+" ",i,j);
                count++;


                if (count>=tablesCount){
                    isFull=true;
                    break;
                }


            }
            if (isFull){
                break;
            }

        }


    }
}
