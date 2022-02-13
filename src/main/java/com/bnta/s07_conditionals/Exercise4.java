/*
Q4:  Greater than >

Similar to Q1, now create an 'if' statement which checks if one Integer value is greater than the other.
Include an 'else' statement here for if the condition is not satisfied.

- Create two 'int' variables.  Assign them values.
- Create an 'if' statement which compares whether one value is greater than the other.
- Print something to the console if the condition is met.
- Create an 'else' statement which prints to the console if the above condition is NOT met.
 */

package com.bnta.s07_conditionals;

public class Exercise4 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create two 'int' variables, and assign them values
        int num1 = 4;
        int num2 = 3;
        // Print both numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        // Create an 'if' statement which compares whether one value is greater than the other
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        // Create an 'else' statement which prints to the console if the above condition is NOT met
        else {
            System.out.println(num1 + " is not greater than " + num2);
        }
    }

}
