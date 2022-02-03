/*
Q10:  Looping to check for a specified value

Start from your solution to Q5.
Create a String variable called 'condition' which has the value "c".
Create a Boolean variable called 'hasC' which has the value 'false'.
Create a 'for' loop which goes through each item in our array, comparing it against our 'condition' variable.
If the two are equal, change the 'hasC' value to 'true'.
Once the 'for' loop concludes, print out a message which tells you if 'hasC' is 'true' or 'false'.

Change the value of your condition variable to see how your functionality behaves if the condition is not satisfied.
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_arrays;

// Import Arrays class
import java.util.Arrays;

public class Exercise10 {

    // Main method
    public static void main(String[] args) {
        // (Start from solution to Q5...)
        // Declare and initialise a String array which holds the values "a", "b", "c", and "d"
        String[] arr = {"a", "b", "c", "d"};
        // Testing if condition not satisfied (see below)
        // String[] arr = {"a", "b", "d", "e"};
        // Print the array to the console
        System.out.println(Arrays.toString(arr));
        // Create a String variable called 'condition' which has the value "c"
        String condition = "c";
        // Create a Boolean variable called 'hasC' which has the value 'false'
        Boolean hasC = false;
        // Create a 'for' loop which goes through each item in our array, comparing it against our 'condition' variable
        for (int i = 0; i < arr.length; i++) {
            // If the two are equal, change the 'hasC' value to 'true'
            if (arr[i] == condition) {
                hasC = true;
            }
        }
        // Once the 'for' loop concludes, print out a message which tells you if 'hasC' is 'true' or 'false'
        // System.out.println(hasC);
        if (hasC == true) {
            System.out.println("True: array contains " + condition);
        } else {
            System.out.println("False: Array does not contain " + condition);
        }

    }

}
