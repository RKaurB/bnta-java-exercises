/*
Q3:  Comparison of String (Part 2)

Repeat the same exercise as above, but this time ensure that you are creating a new string object for both variables
(e.g. String myString = new String("Hello!")).

- Create a string variable using the 'new' keyword.
- Create a second string variable which has the same value as the first, again using the 'new' keyword.
- Create an 'if' statement which compares the two variables, and prints to the console if they are equal.

How strange - we have two variables that are being assigned the same String value, but they aren't equal.  Why is this?

Try changing your answer to instead use the .equals() method.  Does this change how your code behaves at all?
 */

package com.bnta.s7_conditionals;

public class Exercise3 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create a string variable using the 'new' keyword
        String str1 = new String("hello");
        // Create a second string variable which has the same value as the first, again using the 'new' keyword
        String str2 = new String("hello");
        // Print out both strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        // Create an 'if' statement which compares the two variables, and prints to the console if they are equal
        // if (str1 == str2) {
        if (str1.equals(str2)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }

}
