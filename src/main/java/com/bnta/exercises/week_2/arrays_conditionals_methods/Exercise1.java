/* Write a method that reverses any String and print to console
   Input should be a string
   Output should be reversed input
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        // Example:
        // https://www.codegrepper.com/code-examples/java/how+to+print+a+string+in+reverse+java
        // String input = "hello";
        // for (int i = input.length() - 1; i >= 0; i--) {
            // System.out.println(input.charAt(i));

        // Invoke the reverse method, with desired string input in brackets
        // reverse("testing");

        // We can instead use Scanner to take user inputted string and store in input variable
        // Create scanner variable to store user input
        Scanner scanner = new Scanner(System.in);
        // Request user input
        System.out.println("Enter a string: ");
        // Read user input from scanner, and store in input variable
        String input = scanner.nextLine();
        System.out.println("Original string: " + input);

        // Invoke the reverse method, now with user inputted string
        reverse(input);
        }

    public static void reverse(String input) {
        // Initialise the output variable
        String output = "";
        // Loop through the input string, starting at the last character in the string, iterating through while i is greater than/equal to 0, with i decrementing by 1 on each iteration
        for (int i = input.length() - 1; i >= 0 ; i--) {
            // On each iteration, add that character to the output string
            output += input.charAt(i);
        }

        // Once loop has finished, print final output string
        // Should be reversed input string!
        System.out.println("Reversed string: " + output);
    }

}

