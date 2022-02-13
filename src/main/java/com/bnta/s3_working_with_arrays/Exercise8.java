/*
Q8:  Looping over an array - initialisation

Declare a new array which can hold the numbers from 1-10 (inclusive).
Create a 'for' loop which initialises this array with the numbers 1-10.
Print the array to the console.
 */

package com.bnta.s3_working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise8 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Declare a new array which can hold the numbers from 1-10 (inclusive)
        int[] arr = new int[10];
        // Create a 'for' loop that iterates through the length of the array, incrementing the index by 1 on each iteration
        for (int i = 0; i < arr.length; i++) {
            // Initialise the array with the numbers 1-10
            arr[i] = i + 1;
        }
        // Print the array to the console
        System.out.println(Arrays.toString(arr));
    }
}
