/*
  Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
  You might compile and run the program via command line or by editing configuration and pass program arguments
*/

package com.bnta.s6_arrays_conditionals_methods;

import java.util.Scanner;

public class Exercise3 {

    // com.bnta.s1_java_fundamentals_1.Main method
    public static void main(String[] args) {
        // Create scanner variable to store user input
        Scanner input = new Scanner(System.in);
        // Initialise num variable
        // int num;
        // Request user input
        System.out.println("Enter a number: ");
        // Read user input from scanner, and store in num variable
        int num = input.nextInt();
        // Call oddOfEven method and print out the result
        System.out.println("This number [" + num + "] is " + oddOrEven(num));
    }

    // oddOrEven method
    public static String oddOrEven(int num) {
        // String result = "";
        // Create result variable
        String result;
        // If the entered number is divisible by 2 with no remainder, it is an even number
        if (num % 2 == 0) {
            result = "even";
        } else {
            // Else, the number is odd
            result = "odd";
        }
        // Return the result (i.e. even/odd)
        return result;
    }
}

