/*
Q3:  Putting information into our array with .fill()

Using your array from Q1, fill it with the number '4'
Print the array to the console
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise3 {

    // Main method
    public static void main(String[] args) {
        // Declare an empty integer array of length = 3
        int[] intArr = new int[3];
        // Fill array with the number '4'
        Arrays.fill(intArr, 4);
        // Print the array to the console
        System.out.println(Arrays.toString((intArr)));
    }
    
}
