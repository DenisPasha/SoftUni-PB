package P06NestedLoops.MoreExcersises;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {




//        Ред 1.	Малка буква от английската азбука за начало на интервала – от ‘a’ до ‚z’.
//        Ред 2.	Малка буква от английската азбука за край на интервала  – от първата буква до ‚z’.
//        Ред 3.	Малка буква от английската азбука – от ‘a’ до ‚z’ – като комбинациите съдържащи тази буквата се пропускат.
//

        Scanner scanner = new Scanner(System.in);


        String startChar=scanner.nextLine();
        String endChar=scanner.nextLine();
        String ignore =scanner.nextLine();

        char x1=startChar.charAt(0);
        char x2=endChar.charAt(0);
        char x3=ignore.charAt(0);
        int counter=0;


        for (char a1=x1; a1<=x2; a1++){

            if (a1==x3){
                continue;
            }
            for (char a2=x1; a2<=x2; a2++){

                if (a2==x3){
                    continue;
                }

                for (char a3=x1; a3<=x2; a3++){

                    if (a3==x3){
                        continue;
                    }
                    System.out.printf("%c%c%c ",a1,a2,a3);
                    counter++;
                }


            }


        }
        System.out.println(counter);

        
    }
}
