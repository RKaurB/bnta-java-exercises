/*
Q6:  Try catch
     Write a program that converts program arguments to an integer
     - if value cannot be converted to int store them somewhere
     - calculate sum for numbers that can be converted to an integer
     - finally print the numbers that cannot be converted to an int
     - example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
     - output: Sum: 6 and a, b, foo are not numbers.
 */

package com.bnta.exercises.week_2.basic_exercises.enums_dates_exceptions;

import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        // Create string array to be converted into integers
        String[] stringArr = {"1", "2", "a", "b", "foo", "3"};

        // Create and initialise variable to store sum of integers
        int sum = 0;

        // Create and initialise strings to hold values that can/cannot be converted to integers
        String notConvertedToInt = "";
        String convertedToInt = "";

        // Loop through string array
        for (int i = 0; i < stringArr.length; i++) {
            // Test for errors while code block is executed
            try {
                // Parse strArr, returning integers and adding them to the string convertedToInt, each separated by a comma and space
                // convertedToInt += Integer.parseInt(stringArr[i]) + " ";
                convertedToInt += Integer.parseInt(stringArr[i]) + ", ";
                //
                // Parse strArr, returning integers and adding them to the total sum integer variable
                sum += Integer.parseInt(stringArr[i]);
            // Execute code block if error occurs in the try block
            } catch (Exception e) {
                // Add strArray elements that cannot be converted to integers, to the string notConvertedToInt, each separated by a comma and space
                // notConvertedToInt += stringArr[i] + " ";
                notConvertedToInt += stringArr[i] + ", ";
            }
        }

        // Print sum of integers together with converted integers, each separated by a comma and space (except for the last integer in the list, i.e. length - 2 removes that comma and space)
        // System.out.println("Sum of integers [" + convertedToInt + "]: " + sum);
        System.out.println("Sum of integers [" + convertedToInt.substring(0, convertedToInt.length() - 2) + "]: " + sum);

        // Print those elements that were not converted to integers, using the same pattern as above
        // System.out.println("Not able to convert to integers: " + notConvertedToInt);
        System.out.println("Not able to convert to integers: [" + notConvertedToInt.substring(0, notConvertedToInt.length() - 2) + "]");

    }

}
