package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P08SecretDoorsLock {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int hundrets= Integer.parseInt(scanner.nextLine());
        int tens= Integer.parseInt(scanner.nextLine());
        int unites= Integer.parseInt(scanner.nextLine());

        for (int i=1; i<=hundrets; i++){

            for (int j=1;j<=tens;j++){

                for (int k=1; k<=unites; k++){

                   if (i%2==0){
                       if (k%2==0){
                           if (j==2||j==3||j==5||j==7){
                               System.out.printf("%d %d %d",i,j,k);
                               System.out.println();
                           }
                       }
                   }


                }
            }
        }


    }
}
