package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P10Profit {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int coins1lv= Integer.parseInt(scanner.nextLine());
        int coint2lv= Integer.parseInt(scanner.nextLine());
        int notes5lv= Integer.parseInt(scanner.nextLine());
        int sum= Integer.parseInt(scanner.nextLine());
        int curentSum=0;

       for (int i=0;i<=coins1lv;i++){

           for (int j=0; j<=coint2lv; j++){

               for (int k=0;k<=notes5lv; k++){


                   if (i*1+j*2+k*5==sum){
                       System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.",i,j,k,sum);
                       System.out.println();
                   }


               }
           }
       }




    }
}
