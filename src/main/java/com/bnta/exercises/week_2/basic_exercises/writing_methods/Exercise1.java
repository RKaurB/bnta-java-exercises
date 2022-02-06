/*
Q1:  Write a method which takes two numbers as arguments and prints their sum to the terminal.
 */

package com.bnta.exercises.week_2.basic_exercises.writing_methods;

public class Exercise1 {

    // Main class
    public static void main(String[] args) {
        // Call printSum method
        printSum(2, 5);
    }

    // Method which takes two numbers
    public static void printSum(int num1, int num2) {
        // Sum the two numbers together
        int sum = num1 + num2;
        // Format and print their sum to the terminal
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

}
