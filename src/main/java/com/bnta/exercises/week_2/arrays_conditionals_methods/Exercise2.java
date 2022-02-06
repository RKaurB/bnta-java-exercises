/*
  Given the following String input
  String input = "   b ri   ght net   work  "
  Write a program that transforms input into: Bright Network
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

public class Exercise2 {

    // removeSpaces method - removes spaces and capitalises selected letters in the pre-defined string input, in accordance with desired output
    public static String removeSpaces(String input) {
        // Prints out original string input, for comparison with re-formatted string output
        System.out.println("Original string: " + input);
        // replaceAll - deletes all whitespace in the string, using replacement
        String withoutSpaces = input.replaceAll(" ", "");  // can also use input.replaceAll("\s", "")
        // Prints out string with all spaces removed
        System.out.println("String without spaces: " + withoutSpaces);
        // Returns characters 0 to 13 of the string, with a capitalised first character (B), a space after the 6th character (between t and n), and a capitalised 7th character (N)
        return withoutSpaces.substring(0,1).toUpperCase() + withoutSpaces.substring(1,6) + " " + withoutSpaces.substring(6,7).toUpperCase() + withoutSpaces.substring(7,13);
    }

    // Main method
    public static void main(String[] args) {
        // Original string input
        String input = "   b ri   ght net   work  ";
        // Prints out the string with all spaces removed
        System.out.println("Re-formatted string: " + removeSpaces(input));
    }

}

