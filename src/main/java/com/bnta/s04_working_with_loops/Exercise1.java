/*
Q1:  Create a loop that prints all numbers from 0-10

Within your com.bnta.s1_java_fundamentals_1.Main class, create some functionality which uses a for loop to print the numbers from 0 to 10.

e.g.
public static void main(String[] args) {
    // create a for loop which goes from 0 to 10
    // print each value
}
 */

package com.bnta.s04_working_with_loops;

public class Exercise1 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create a for loop that goes from 0 to 10
        for (int i = 0; i <= 10; i++) {
            //  Print each value (i.e. 0-10)
            System.out.println(i);
        }
    }

}
