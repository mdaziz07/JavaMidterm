package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int i = 0;
        int factorial= 0;
        System.out.print(x + ",");

        do{
            factorial = x + y;
            y = x;
            x = factorial;
            System.out.print(factorial+",");
            i++;
        }while(i < 40);

    }

}
