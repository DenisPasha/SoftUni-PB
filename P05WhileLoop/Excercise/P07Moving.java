package P05WhileLoop.Excercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        int width= Integer.parseInt(scanner.nextLine());
        int length= Integer.parseInt(scanner.nextLine());
        int height= Integer.parseInt(scanner.nextLine());

        int totalSpace=width*length*height;
        String boxCount="";
        int boxesCounter=0;
        boolean done=false;



        while (totalSpace>boxesCounter){

             boxCount=scanner.nextLine();

             if (!boxCount.equals("Done")){
                 int boxesCount= Integer.parseInt(boxCount);
                 boxesCounter=boxesCounter+boxesCount;

             }else {
                 done=true;
                 break;
             }

        }
        if (done){
            System.out.printf("%d Cubic meters left.",totalSpace-boxesCounter);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(boxesCounter-totalSpace));
        }


    }
}
