package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P12Thesongofthewheels {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);


        int m= Integer.parseInt(scanner.nextLine());
        int numCounter=0;
        String password="";
        int magic=0;

        for (int a=1; a<=9; a++){

            for (int b=1; b<=9; b++){

                for (int c=1; c<=9; c++){

                    for (int d=1; d<=9; d++){

                      if (a<b && c>d){
                          if (a*b+c*d==m){
                              System.out.printf(" %d%d%d%d",a,b,c,d);

                              numCounter++;

                              if (numCounter==4){
//                                  String numA= String.valueOf(a);
//                                  String numB= String.valueOf(b);
//                                  String numC= String.valueOf(c);
//                                  String numD= String.valueOf(d);
                                 // password=numA+numB+numC+numD;
                                  magic=Integer.valueOf(String.valueOf(a)+String.valueOf(b)+String.valueOf(c)+String.valueOf(d));
                              }



                          }
                      }

                    }
                }
            }



        }
        if (numCounter>=4){
            System.out.println();
           // System.out.printf("Password: %s",password);
            System.out.printf("Password: %d",magic);
        }else {
            System.out.println("No!");
        }



    }
}
