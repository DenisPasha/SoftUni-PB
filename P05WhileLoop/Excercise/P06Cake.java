package P05WhileLoop.Excercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aSide= Integer.parseInt(scanner.nextLine());
        int bSide= Integer.parseInt(scanner.nextLine());

        int totalPieces=aSide*bSide;
        int totalPieces1=aSide*bSide;
        boolean isStop=false;

        while (totalPieces>0){

            String inputPiece=scanner.nextLine();

            if (!inputPiece.equals("STOP")){

                int takenPiece=Integer.parseInt(inputPiece);
                totalPieces=totalPieces-takenPiece;
            }else {

                isStop=true;
                break;
            }

        }

        if (isStop){
            System.out.printf("%d pieces are left.",totalPieces);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(totalPieces));
        }

    }
}
