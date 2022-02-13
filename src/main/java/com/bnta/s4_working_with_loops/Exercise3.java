/*
Q3:  Create a loop that prints all even numbers from 0-20

Within your com.bnta.s1_java_fundamentals_1.Main class, create some functionality which uses a for loop to print the even numbers from 0 to 20 (inclusive).

e.g. public static void main(String[] args) {
    // create a for loop which goes from 0 to 20
    // print each even value
}

How can you make it exclude 0?
There are a couple ways you could go about this, can you find both?
 */


package com.bnta.s4_working_with_loops;

public class Exercise3 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {

        // Create a for loop which goes from 0 to 20, in even numbers only
        // for (int i = 0; i <= 20 ; i += 2) {

        // Create a loop which goes from 0 to 20, in even numbers only, but this time, make it exclude 0
        for (int i = 2; i <= 20; i += 2) {
            // Print each even value
            System.out.println(i);
        }

    }

}
