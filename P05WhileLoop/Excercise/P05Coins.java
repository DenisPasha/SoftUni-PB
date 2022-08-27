package P05WhileLoop.Excercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        double input= Double.parseDouble(scanner.nextLine());
        int change= (int) (input*100);
        int coinCount=0;

        while (change>0){

            if (change>=200){
                coinCount=coinCount+1;
                change=change-200;
            } else if (change>=100) {
                coinCount=coinCount+1;
                change=change-100;
            } else if (change>=50) {
                coinCount=coinCount+1;
                change=change-50;
            } else if (change>=20) {
                coinCount=coinCount+1;
                change=change-20;
            } else if (change>=10) {
                coinCount=coinCount+1;
                change=change-10;
            } else if (change>=5) {
                coinCount=coinCount+1;
                change=change-5;
            } else if (change>=2) {
                coinCount=coinCount+1;
                change=change-2;
            } else if (change>=1) {
                coinCount=coinCount+1;
                change=change-1;
            }
        }

        System.out.println(coinCount);

    }
}
