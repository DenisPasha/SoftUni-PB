package P02conditionalStatements.Lecturee;

import java.util.Scanner;

public class P1ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if(grade >=5){
            System.out.println("Excellent!");
        }
    }
}
