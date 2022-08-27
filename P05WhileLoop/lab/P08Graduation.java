package P05WhileLoop.lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String name=scanner.nextLine();

        int year=1;
        double sum=0;
        double avrage=0;
        int poorGrades=0;
        boolean isExcluded=false;


        while (year<=12){

            if (poorGrades>=2){
                isExcluded=true;
                break;

            }
                double grade= Double.parseDouble(scanner.nextLine());

                if (grade<4){
                    poorGrades=poorGrades+1;
                    continue;
                }

                year=year+1;
                sum=sum+grade;

        }
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade",name,year);
        }else {
            avrage=sum/12;
            System.out.printf("%s graduated. Average grade: %.2f",name,avrage);
        }



    }
}
