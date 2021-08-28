package math.problems;

public class Factorial {

    /*
     Write a method to return the Factorial of any given number using Recursion as well as Iteration

     Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        int num = 6;

        int factorial = 1;
        for(int i = num; i >= 1; i--){

            factorial = factorial * i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
    }
}
