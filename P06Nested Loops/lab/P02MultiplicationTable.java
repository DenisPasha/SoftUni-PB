package P06NestedLoops.lab;

public class P02MultiplicationTable {
    public static void main(String[] args) {


        for (int a=1; a<=10; a++){
            for (int b=1; b<=10; b++){

                int sum=a*b;
                System.out.printf("%d * %d = %d\n",a,b,sum);
            }
        }

    }
}
