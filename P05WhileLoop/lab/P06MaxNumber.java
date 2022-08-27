package P05WhileLoop.lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();

        int max=Integer.MIN_VALUE;

        while (!n.equals("Stop")){
            int ammount= Integer.parseInt(n);

            if (ammount>max){
                max=ammount;

            }
            n=scanner.nextLine();
        }


        System.out.println(max);

    }
}
