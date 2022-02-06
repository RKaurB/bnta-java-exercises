/*
Q 3:  Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.
 */

package com.bnta.exercises.week_2.basic_exercises.writing_methods;

public class Exercise3 {

    // Main class
    public static void main(String[] args) {
        // Call method and print returned boolean result (true/false)
        System.out.println(compareNums(4, 3));
    }

    // Method which takes two numbers as arguments and returns a boolean value (true/false)
    public static boolean compareNums(int num1, int num2) {
        // Initialise boolean variable
        boolean isSame;
        // If both numbers are the same, set boolean to true
        if (num1 == num2) {
            isSame = true;
        }
        // Else, if not the same, set boolean to false
        else {
            isSame = false;
        }
        // return boolean value
        return isSame;
    }

}
