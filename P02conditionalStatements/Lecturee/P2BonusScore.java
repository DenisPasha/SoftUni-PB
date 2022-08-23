package P02conditionalStatements.Lecturee;

import java.util.Scanner;

public class P2BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score= Integer.parseInt(scanner.nextLine());
        double bonus=0;

        //· Ако числото е до 100 включително, бонус точките са 5.
        //
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        if(score <=100){
             bonus=5;
        }if(score >100 & score<1000 ){
             bonus= score*0.20;
        }if(score >1000 ){
            bonus =score*0.10;
        }
        if (score %2==0){
            bonus =bonus+1;
        }

    }
}
