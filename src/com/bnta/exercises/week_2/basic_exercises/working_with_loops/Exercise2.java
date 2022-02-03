/*
Q2:  Create a loop that prints all numbers from 10-0

Within your Main class, create some functionality which uses a for loop to print the numbers from 10 to 0 (inclusive).

e.g.
public static void main(String[] args) {
    // create a for loop which goes from 10 down to 10
    // print each value
}

Could you use a previously declared int as your initial value? Try it out!
 */

package com.bnta.exercises.week_2.basic_exercises.working_with_loops;

public class Exercise2 {

    // Main method
    public static void main(String[] args) {
        // Initialise int variable
        int i = 10;
        // Create a for loop which goes from 10 down to 10
        for (; i >= 0; i--) {
            // Print each value (i.e. 10-0)
            System.out.println(i);
        }
    }

}
