/*
Q5:  Create a loop that prints each item in an array

Using your answer to the previous question, use a second for loop which prints each item in your array to the terminal individually.

e.g.
public static void main(String[] args) {
    // using your answer from Question 4, create a for loop that goes through the values
    // print each value individually
}
 */

package com.bnta.s4_working_with_loops;

public class Exercise5 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create an array of size 11 (to hold values 0-10, inclusive)
        int[] arr = new int[11];
        // Loop through the length of the array 11 times
        for (int i = 0; i < arr.length; i++) {
            // Add each value to the array, and print each value individually
            System.out.println(arr[i] = i);
        }
    }

}
