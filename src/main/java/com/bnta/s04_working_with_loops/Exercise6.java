/*
Q6:  Create a loop that adds to a sum. Prints the sum

Using your answer from the question two above, use a for loop to add each number to a sum value. Print the sum value.

e.g.
public static void main(String[] args) {
    // create a sum variable
    // using your answer from Question 4, create a for loop that goes through the values
    // add each item to the sum value
    // print the total sum
}
 */

package com.bnta.s04_working_with_loops;

// Import Arrays method
import java.util.Arrays;

public class Exercise6 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create an array of size 11 (to hold values 0-10, inclusive)
        int[] arr = new int[11];
        // create a sum variable
        int sum = 0;
        // Loop through the length of the array 11 times
        for (int i = 0; i < arr.length; i++) {
            // Add each value to the array (0-10)
            arr[i] = i;
            // Add each value in the array, to the sum value (i.e. 0 + 1 + 2... + 10)
            sum = sum + i;
        }
        // Convert array to string and print
        System.out.println("Array: " + Arrays.toString(arr));
        // Print the total sum
        System.out.println("Sum: " + sum);
    }

}
