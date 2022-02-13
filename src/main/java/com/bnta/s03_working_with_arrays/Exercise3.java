/*
Q3:  Putting information into our array with .fill()

Using your array from Q1, fill it with the number '4'
Print the array to the console
 */

package com.bnta.s03_working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise3 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Declare an empty integer array of length = 3
        int[] intArr = new int[3];
        // Fill array with the number '4'
        Arrays.fill(intArr, 4);
        // Print the array to the console
        System.out.println(Arrays.toString((intArr)));
    }
    
}
