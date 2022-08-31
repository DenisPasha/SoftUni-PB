package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P06WeddingSeats {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);

        char lastSector=scanner.nextLine().charAt(0);
        int rowsCountFirstSector= Integer.parseInt(scanner.nextLine());
        int oddRowsSeatsCount= Integer.parseInt(scanner.nextLine());
        int counter=0;



        for (char i='A'; i<=lastSector; i++){



            for ( int j=1; j<=rowsCountFirstSector; j++){


                if (j%2!=0){

                    for (char k='a';k<'a'+ oddRowsSeatsCount;k++){

                        counter++;



                        System.out.printf("%c%d%c",i,j,k);
                        System.out.println();
                    }


                } else if (j%2==0){


                    for (char k='a';k<'a'+(oddRowsSeatsCount+2);k++){


                        String seat="";


                        counter++;
                        System.out.printf("%c%d%c",i,j,k);
                        System.out.println();
                    }
                }

            }
            rowsCountFirstSector++;
        }
        System.out.println(counter);


    }
}
