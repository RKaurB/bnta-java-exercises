/*
Q7:  Looping over an array - print

Using your array from Q5, create a 'for' loop which prints each item in the array.
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise7 {

    // Main method
    public static void main(String[] args) {
        // Declare and initialise a String array which holds the values "a", "b", "c", and "d"
        String[] arr = {"a", "b", "c", "d"};
        // Create placeholder String array
        String[] newArr = new String[4];
        // Create a 'for' loop which prints each item in the array
        for (int i = 0; i < arr.length; i++) {
            // Print out each array item separately
            // System.out.println(str[i]);
            // Assign array element at index i to placeholder array at index i
            newArr[i] = arr[i];
        }
        // Print out array
        System.out.println(Arrays.toString(newArr));
    }

}
