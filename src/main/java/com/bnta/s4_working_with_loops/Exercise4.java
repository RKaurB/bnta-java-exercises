/*
Q4:  Create a loop that adds all numbers 0-10 to an array then prints the array

Within your com.bnta.s1_java_fundamentals_1.Main class, create some functionality which uses a for loop which adds all numbers from 0 to 10 (inclusive) to an array.
Print this array in the console.

e.g.
public static void main(String[] args) {
    // create an array. Remember to manually set the size
    // create a for loop which goes from 0 to 10, adding each value to an array
    // print our array
}

When we create our array, we set a size. Why is this integer different from our max value of 10?
 */

package com.bnta.s4_working_with_loops;

// Import Arrays method
import java.util.Arrays;

public class Exercise4 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create an array of size 11 (to hold values 0-10, inclusive)
        int[] arr = new int[11];
        // Loop through the length of the array 11 times
        for (int i = 0; i < arr.length; i++) {
            // Add each value to the array
            arr[i] = i;
        }
        // Print out array
        // System.out.println(arr);
        // Convert array to string and print
        System.out.println(Arrays.toString(arr));
    }

}