package com.bnta.exercises.week_1.java_fundamentals;/*  Write a program that compares two String contents.
    Create 3 variables.
    2 to store both strings and 1 to store the result
    Print the result
*/

public class Exercise2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        // testing
        // String str2 = "Hello";
        String str2 = "hello";
        boolean compareStrings = str1.equals(str2);
        System.out.println(compareStrings);
    }
}
