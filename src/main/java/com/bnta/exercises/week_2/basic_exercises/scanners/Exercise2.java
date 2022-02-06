/*
Q2:  Take an input string from the user, make the word uppercase, and then print it back out

- Create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
- Create a variable which is assigned to the value passed into the scanner from the terminal
- Make the input string uppercase
- Print this variable
 */

package com.bnta.exercises.week_2.basic_exercises.scanners;

// Import Scanner
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner scanner = new Scanner(System.in);
        // Create a variable which is assigned to the value passed into the scanner from terminal, and make the input string uppercase
        System.out.println("Enter something:");
        String input = scanner.nextLine().toUpperCase();
        // Print this variable
        System.out.println(input);

    }

}
