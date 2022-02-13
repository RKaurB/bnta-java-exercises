/*
Q1:  Take an input string from the user (from the terminal) and print it back out

- Create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
- Create a variable which is assigned to the value passed into the scanner from the terminal.
- Print this variable.
 */

package com.bnta.s08_scanners;

// Import Scanner class
import java.util.Scanner;

public class Exercise1 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       // create scanner variable that stores user input
        System.out.println("Enter something: ");        // request user input

        String uInput = scanner.nextLine();             // read user input (to be stored in scanner variable)

        System.out.println("You typed: " + uInput);     // print out input

    }
}
