package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     * Write a method to return the Factorial of any given number using Recursion, as well as iteration.
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        int i,fact = 1;
        int number = 5;
        for (i = 1; i<= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " = " + fact);


    }

}
