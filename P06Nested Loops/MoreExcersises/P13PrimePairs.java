package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P13PrimePairs {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int startingPointFirstPair= Integer.parseInt(scanner.nextLine());
        int startingPointSecondPair= Integer.parseInt(scanner.nextLine());

        int diffStartEndFirstPair= Integer.parseInt(scanner.nextLine());
        int diffStartEndSecondPair= Integer.parseInt(scanner.nextLine());

        int endingPointFirstPair=startingPointFirstPair+diffStartEndFirstPair;
        int endingPointSecondPair=startingPointSecondPair+diffStartEndSecondPair;



        int secondNum=0;
        int firstNum=0;

        for (int i=startingPointFirstPair; i<endingPointFirstPair; i++){

            int counter=0;
            for(firstNum =i; firstNum>=1; firstNum--)
            {
                if(i%firstNum==0)
                {
                    counter = counter + 1;
                }
            }

            for (int j=startingPointSecondPair; j<endingPointSecondPair; j++){

                int counter1=0;

                for(secondNum =j; secondNum>=1; secondNum--)
                {
                    if(j%secondNum==0)
                    {
                        counter1 = counter1 + 1;
                    }
                }

                if (counter ==2 && counter1==2)
                {

                    System.out.printf("%d%d",i,j);
                    System.out.println();
                }


            }









        }





    }
}
