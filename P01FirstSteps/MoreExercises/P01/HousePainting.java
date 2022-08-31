package P01firstStepsInCoding.MoreExercises.P01;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        //walls
        double window=2.25;
        double entrnce =1.2;


        double heightHouse= Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double heightTriangle= Double.parseDouble(scanner.nextLine());

        double aSide=(heightHouse*width)-window;
        double bSide=(heightHouse*heightHouse)-entrnce;

        double totalWalls=(aSide*2)+(bSide*2);
        double paintNeeded=totalWalls/3.4;

        //ceilnig


        double dSide=2*(heightHouse*width);
        double cSide=2*(heightHouse*heightTriangle/2);


        double totalCS=(dSide+cSide)/4.3;
        System.out.printf("%.2f \n",paintNeeded);
        System.out.printf("%.2f \n",totalCS);




    }
}
