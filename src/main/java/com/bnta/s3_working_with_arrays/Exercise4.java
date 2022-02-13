/*
Q4:  Assigning a value to an array by index

Adding onto your code from Qs 1-3, reassign the second value in the array, to the number '17'.
Print the array to the console.

What happens if you try to assign a value to an index outside the bounds of the array?
Also, what happens if you try to put in a floating point number, such as 6.7?
 */

package com.bnta.s3_working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise4 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Declare an empty integer array of length = 3
        int[] intArr = new int[3];
        // Fill array with the number '4'
        Arrays.fill(intArr, 4);
        // Reassign the second value in the array, to the number '17'
        intArr[1] = 17;
        // Print the array to the console
        System.out.println(Arrays.toString((intArr)));
    }

}
