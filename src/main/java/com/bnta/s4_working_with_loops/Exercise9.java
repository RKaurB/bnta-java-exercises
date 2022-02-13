/*
Q9:  Create a loop that finds the greatest number in an array of numbers, prints the number (+ prints the index)

Start with the array of numbers: [1, 6, 17, 9, 20, 5] Using a for loop to go through the array to find the greatest value Print the greatest number in the array

Hint: create a maxNum value which you check each item against and then reassign if the number is exceeded.

e.g.
public static void main(String[] args) {
    // create a for loop which goes through number in our array
    // check whether the value is greater than the current greatest value
    // reassign the current greatest value if true
    // print the greatest value
}
 */

package com.bnta.s4_working_with_loops;

public class Exercise9 {

    public static void main(String[] args) {
        // Create and array with the following numbers
        int[] arr = {1, 6, 17, 9, 20, 5};
        // Create a maxNum value which you check each item against and then reassign if the number is exceeded
        // initially set to the value of the first item in array (arr[0])
        int maxNum = arr[0];
        // Create a for loop which goes through number in our array
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            // Check whether the value is greater than the current greatest value
            if (arr[i] > maxNum) {
                // Reassign the current greatest value if true
                maxNum = arr[i];
                index = i;
            }
        }
        // Print the greatest value (+ index)
        System.out.println("Largest number: " + maxNum + " (i: " + index + ")");
    }

}
