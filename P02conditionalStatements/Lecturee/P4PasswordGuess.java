package P02conditionalStatements.Lecturee;

import java.util.Scanner;

public class P4PasswordGuess {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String password="s3cr3t!P@ssw0rd";

        String pass=scanner.nextLine();

        if (pass.equals(password)){
            System.out.println("Welcome");

        }else {
            System.out.println("Wrong password!");
        }
    }
}
