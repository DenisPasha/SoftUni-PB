package P05WhileLoop.lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        String n= scanner.nextLine();


        int min=Integer.MAX_VALUE;

        while (!n.equals("Stop")){
            int num= Integer.parseInt(n);

            if (num<min){
                min=num;
            }
            n=scanner.nextLine();
        }
        System.out.println(min);

    }
}
