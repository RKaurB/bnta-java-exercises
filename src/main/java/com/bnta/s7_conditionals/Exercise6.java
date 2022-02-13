/*
Q6:  Logical OR ||

Modify your answer to Q5 to instead use an OR operator.
Play about with the values assigned to your three variables, noting how the behaviour changes.
 */

package com.bnta.s7_conditionals;

public class Exercise6 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create three 'int' variables and assign them values, with the first value sitting between the other two
        int num1 = 4;
        int num2 = 3;
        int num3 = 5;
        // Print the three numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        // Create an 'if' statement which compares whether the first value is greater than the second OR less than the third
        if ((num1 > num2) || (num1 < num3)) {
            // Print something to the console if the condition is met
            System.out.println(num1 + " is greater than " + num2 + " OR less than " + num3);
        }
        // Create an 'else' statement which prints to the console if the above condition is NOT met
        else {
            System.out.println(num1 + " is not greater than " + num2 + " NOR less than " + num3);
        }
    }

}
