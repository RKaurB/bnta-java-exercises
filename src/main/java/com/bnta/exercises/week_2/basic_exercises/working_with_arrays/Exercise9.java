/*
Q9:  Looping over an array - reassignment

Adding onto your example from Q9, now create a second 'for' loop which reassigns each value in the array to be double the initial value.
Again, print the array.

If you used a generic for loop in your answer, try implementing your solution using an enhanced for loop!
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise9 {

    // Main method
    public static void main(String[] args) {
        // Declare a new array which can hold the numbers from 1-10 (inclusive)
        int[] arr = new int[10];
        // Create a 'for' loop that iterates through the length of the array, incrementing the index by 1 on each iteration
        // for (int i = 0; i < arr.length; i++) {
        for (int i = 0; i < arr.length; i++) {
            // Initialise the array with the numbers 1-10
            arr[i] = i + 1;
        }
        // Print the array to the console
        System.out.println(Arrays.toString(arr));

        // Create a second 'for' loop (try using an enhanced 'for' loop)
        for (int i : arr) {
            // Reassign each value in the array to be double the initial value
            arr[i - 1] = i * 2;
        }
        // Print the array to the console
        System.out.println(Arrays.toString(arr));
    }

}
