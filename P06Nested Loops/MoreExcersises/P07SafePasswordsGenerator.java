package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P07SafePasswordsGenerator {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        int a= Integer.parseInt(scanner.nextLine());
        int b= Integer.parseInt(scanner.nextLine());
        int maxPasswordCount= Integer.parseInt(scanner.nextLine());
        int counter=0;
        boolean isEnough=false;

        int i=35;
        int j=64;




                while (i<=55){


                    while (j<=96){

                        for (int k=1; k<=a; k++){

                            for (int l=1;l<=b; l++){


                                char one = ((char)i);
                                char two = ((char)j);


                                System.out.printf("%c%c%d%d%c%c|",one,two,k,l,two,one);

                                counter += 1;
                                i++;
                                j++;


                                if (counter >= maxPasswordCount || k == a && l == b)
                                {
                                    return;
                                }
                                if (i > 55)

                                {
                                    i = 35;
                                }
                                if (j > 96)
                                {
                                    j = 64;
                                }

                            }

                        }


                    }
                }



    }
}
