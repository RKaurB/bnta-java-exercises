/*
Q 5:  Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first letter from the string, capitalise that, then join the pieces back together.
 */

package com.bnta.exercises.week_2.basic_exercises.writing_methods;

public class Exercise5 {

    // Main class
    public static void main(String[] args) {
        // Call method here, and store the result in a variable
        String result = capitaliseFirstLetter("hello");
        // Print variable
        System.out.println(result);
    }

    // Write method here
    // Pseudo code - plain English description of what the code will do

    // Method signature - takes string as argument, returns string
    public static String capitaliseFirstLetter(String inputString) {
        // Capitalise the first letter of inputString
        // inputString.toUpperCase();
        // String capitalisedString = inputString.toUpperCase();
        // https://stackoverflow.com/questions/3904579/how-to-capitalize-the-first-letter-of-a-string-in-java
        // Takes the first letter (substring) of the string and capitalises it, then adds it to the rest of the strong (from the second character onwards)
        String capitalisedString = inputString.substring(0, 1).toUpperCase() + inputString.substring(1);

        // Return the modified String
        return capitalisedString;
    }

}


