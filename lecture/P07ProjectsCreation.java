package P01firstStepsInCoding.lecture;

import java.util.Scanner;

public class P07ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int projectsCount = Integer.parseInt(scanner.nextLine());

        int totalTime = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, totalTime, projectsCount);
    }
}
