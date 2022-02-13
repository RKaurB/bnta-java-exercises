/*
Q6b:  Creating an array from another

Using your answer to Q5, create another array which is A COPY of your original array (using the 'Arrays.copyOf()' method).
Note:  The '.copyOf()' method accepts two arguments, first being the array that's being copied, and second being the length of the new array.
Change the value at index 0 of the new array, to 'z'.
Print both of the arrays, and compare.

Have a play about with the second argument.  What happens if it's greater or less than the length of the initial array.
 */

package com.bnta.s03_working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise6b {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Declare and initialise a String array which holds the values "a", "b", "c", and "d"
        String[] arr = {"a", "b", "c", "d"};
        // Create another array which is A COPY of your original array (using the 'Arrays.copyOf()' method)
        String[] secondArr = Arrays.copyOf(arr, 4);
        // Print both of the arrays, and compare
        secondArr[0] = "z";
        // Print both of the arrays, and compare
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(secondArr));
        // Arrays are different
    }

}
