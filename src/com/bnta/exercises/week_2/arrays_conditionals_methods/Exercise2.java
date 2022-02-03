/*
  Given the following String input
  String input = "   b ri   ght net   work  "
  Write a program that transforms input into: Bright Network
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

public class Exercise2 {

    public static String removeSpaces(String input) {
        // replaceAll - deletes all whitespace in the string, using replacement
        String withoutSpaces = input.replaceAll(" ", "");  // can also use input.replaceAll("\s", "")
        // prints out the string with all spaces removed
        System.out.println(withoutSpaces);
        // returns characters 0 to 13 of the string, with a capitalised first character (B), a space after the 6th character (between t and n), and a capitalised 7th character (N)
        return withoutSpaces.substring(0,1).toUpperCase() + withoutSpaces.substring(1,6) + " " + withoutSpaces.substring(6,7).toUpperCase() + withoutSpaces.substring(7,13);
    }

    public static void main(String[] args) {
        // original string input
        String input = "   b ri   ght net   work  ";
        // prints out original string input, for comparison with output
        System.out.println(removeSpaces(input));
    }

}

