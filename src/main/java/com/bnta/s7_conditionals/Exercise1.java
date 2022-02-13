/*
Q1:  An 'if' statement

Simply create an 'if' statement which checks if an integer-type variable is equal to another.

Create an integer variable.
Create a second integer variable.
Create an 'if' statement which compares the two variables, and prints to the console if they are equal.
 */

package com.bnta.s7_conditionals;

public class Exercise1 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create an integer variable
        int num1 = 4;
        // Create a second integer variable
        int num2 = 4;
        // Create an 'if' statement which compares the two variables, and prints to the console if they are equal
        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not equal.");
        }
    }

}
