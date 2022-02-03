/*
Q2:  Printing an array to the console - Arrays.toString()

Using your array from Q1, print the contents to the console
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise2 {

    // Main method
    public static void main(String[] args) {
        // Declare an empty integer array of length = 3
        int[] intArr = new int[3];
        // Assign integer values to the array
        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;
        // Print array contents to the console, using Arrays.toString()
        System.out.println(Arrays.toString(intArr));
    }
}
