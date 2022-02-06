/*
Q5:  Logical AND &&

Expanding on your answer to Q4, create a third Integer value, and modify your 'if' statement to check if the first value is greater than the second AND less than the third.

- Create three 'int' variables.  Assign them values, with the first value sitting between the other two.
- Create an 'if' statement which compares whether the first value is greater than the second AND less than the third.
- Print something to the console if the condition is met.
- Create an 'else' statement which prints to the console if the above condition is NOT met.
 */

package com.bnta.exercises.week_2.basic_exercises.conditionals;

public class Exercise5 {

    // Main method
    public static void main(String[] args) {
        // Create three 'int' variables and assign them values, with the first value sitting between the other two
        int num1 = 4;
        int num2 = 3;
        int num3 = 5;
        // Print the three numbers
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
        System.out.println("Number 3: " + num3);
        // Create an 'if' statement which compares whether the first value is greater than the second AND less than the third
        if ((num1 > num2) && (num1 < num3)) {
            // Print something to the console if the condition is met
            System.out.println(num1 + " is greater than " + num2 + " and less than " + num3);
        }
        // Create an 'else' statement which prints to the console if the above condition is NOT met
        else if ((num1 > num2) && (num1 > num3)) {
            System.out.println(num1 + " is greater than " + num2 + " but not less than " + num3);
        }
        else if ((num1 < num2) && (num1 < num3)) {
            System.out.println(num1 + " is less than " + num3 + "  but not greater than " + num2);
        }
        else if ((num1 < num2) && (num1 > num3)) {
            System.out.println(num1 + " is not greater than " + num2 + "  and not less than " + num3);
        }
    }

}
