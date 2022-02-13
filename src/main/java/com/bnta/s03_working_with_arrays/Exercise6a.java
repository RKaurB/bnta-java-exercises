/*
Q6a:  Creating an array from another

Using your answer to Q5, create a second array which is initialised using your original array.
Hint:  Instead of using the 'new' keyword, try simply giving the name of your original array.
Change the value at index 0 of the new array, to 'z'.
Print both of your arrays, and compare.

Why is this output maybe not what you were expecting??
 */

package com.bnta.s03_working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise6a {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Declare and initialise a String array which holds the values "a", "b", "c", and "d"
        String[] arr = {"a", "b", "c", "d"};
        // Create a second array which is initialised using your original array
        String[] secondArr = arr;
        // Change the value at index 0 of the new array, to 'z'
        secondArr[0] = "z";
        // Print both arrays
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(secondArr));
        // Arrays are both the same!
    }

}
