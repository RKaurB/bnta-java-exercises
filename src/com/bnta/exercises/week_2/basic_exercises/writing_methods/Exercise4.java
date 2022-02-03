/*
Q4:  Write a method which takes two numbers as arguments and prints one of:
"The first number is larger"
"The second number is larger"
"The numbers are equal"
as appropriate.
 */

package com.bnta.exercises.week_2.basic_exercises.writing_methods;

public class Exercise4 {

    // Main function
    public static void main(String[] args) {
        // Call method, takes in two numbers
        compareValues(2, 2);
    }

    // Method which takes two numbers as arguments
    static void compareValues(int num1, int num2) {
        // Compare numbers (if else)...
        // If first number is larger, then print message
        if (num1 > num2) {
            System.out.println("The first number is larger");
        }
        // Else, if second number is larger, then print message
        else if(num2 > num1) {
            System.out.println("The second number is larger");
        // Else, if numbers are equal, then print message
        } else {
            System.out.println("The numbers are equal");
        }

    }

}
