/*
Q2:  Comparison of Strings (Part 1)

In this exercise, please use the shortened form of declaring a String-type variable (e.g. String myString = "Hello").

Create a string variable.
Create a second string variable which has the same value as the first.
Create an 'if' statement which compares the two variables and prints to the console if they are equal.
 */

package com.bnta.exercises.week_2.basic_exercises.conditionals;

public class Exercise2 {

    // Main method
    public static void main(String[] args) {
        // Create a string variable
        String str1 = "hello";
        // Create a second string variable which has the same value as the first
        String str2 = "hello";
        // Print out both strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        // Create an 'if' statement which compares the two variables and prints to the console if they are equal
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
