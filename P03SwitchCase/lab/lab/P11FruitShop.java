package P03SwitchCase.lab.lab;

import java.util.Scanner;

public class P11FruitShop {

    public static void main(String[] args) {


        //Напишете програма, която чете от конзолата плод
        // (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        // ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
        // и количество (десетично число)
        // , въведени от потребителя, и пресмята цената според

        Scanner scanner= new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day=scanner.nextLine();
        double quality= Double.parseDouble(scanner.nextLine());

        double price=0.0;
        switch (fruit){

            case "banana":
            case "apple":
            case "orange":
            case "grapefruit":
            case "kiwi":
            case "pineapple":
            case "grapes":

                switch (day){

                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":

                        if (fruit.equals("banana")){
                            price=2.50;
                        } else if (fruit.equals("apple")) {
                            price=1.20;
                        }else if (fruit.equals("orange")){
                            price=0.85;
                        } else if (fruit.equals("grapefruit")) {
                            price=1.45;
                        } else if (fruit.equals("kiwi")) {
                            price=2.70;
                        } else if (fruit.equals("pineapple")) {
                            price=5.50;
                        }else if (fruit.equals("grapes")){
                            price=3.85;
                        }
                        double sum=price*quality;
                        System.out.printf("%.2f",sum);

                        break;
                    case "Saturday":
                    case "Sunday":
                        if (fruit.equals("banana")){
                            price=2.70;
                        } else if (fruit.equals("apple")) {
                            price=1.25;
                        }else if (fruit.equals("orange")){
                            price=0.90;
                        } else if (fruit.equals("grapefruit")) {
                            price=1.60;
                        } else if (fruit.equals("kiwi")) {
                            price=3.00;
                        } else if (fruit.equals("pineapple")) {
                            price=5.60;
                        }else if (fruit.equals("grapes")){
                            price=4.20;
                        }
                        double sum1=price*quality;
                        System.out.printf("%.2f",sum1);

                        break;
                    default:
                        System.out.println("error");


                }

                break;
            default:
                System.out.println("error");


        }





    }
}
