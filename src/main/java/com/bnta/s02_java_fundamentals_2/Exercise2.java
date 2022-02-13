/*  Write a program that compares two String contents.
    Create 3 variables.
    2 to store both strings and 1 to store the result
    Print the result
*/

package com.bnta.s02_java_fundamentals_2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
//        String str1 = "Hello";
//        // testing
//        // String str2 = "Hello";
//        String str2 = "hello";
//        boolean compareStrings = str1.equals(str2);
//        System.out.println(compareStrings);
//    }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String inputString1 = scanner.nextLine();
        System.out.println("Enter another word: ");
        String inputString2 = scanner.nextLine();
        boolean compareStrings = inputString1.equals(inputString2);

        if (compareStrings) {
            System.out.println("Comparing strings: " + inputString1 + ", " + inputString2 + "...");
            System.out.println("Strings are equal!");
            ;
        } else {
            System.out.println("Comparing strings: " + inputString1 + ", " + inputString2 + "...");
            System.out.println("Strings are not equal!");
        }

    }
}