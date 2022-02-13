/*
Q2:  Write a method which takes a number as an argument and returns that number negated,
e.g. passing 5 as an argument should return -5; passing -10 should return 10.
 */

package com.bnta.s05_writing_methods;

public class Exercise2 {

    // com.bnta.s1_java_fundamentals_1.Main class
    public static void main(String[] args) {
        // Call on method and print negated number
        System.out.println(negate(-10));
    }

    // Method which takes a number as an argument
    public static int negate(int num) {
        // https://stackoverflow.com/questions/493494/make-a-negative-number-positive
        // initialise variable
        int negatedNum = num;
        // If that number is negative (less than 1), make it positive
        if (num < 0) {
            negatedNum = -num;
        }
        // If that number is positive (greater than 1), make it negative
        else if (num > 0) {
            negatedNum = -num;
        }
        // return negated number
        return negatedNum;
    }

}
