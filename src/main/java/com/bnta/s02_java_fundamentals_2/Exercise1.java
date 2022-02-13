/*  Write a program that compares two numbers. i.e x > y
    Create 3 variables.
    2 to store both numbers and 1 to store the result
    Print the result
*/

package com.bnta.s02_java_fundamentals_2;

import java.util.Scanner;

public class Exercise1 {

//    public static void main(String[] args) {
//        int num1 = 4;
//        int num2 = 4;
//        boolean compareNums = num1 == num2;
//        System.out.println(compareNums);
//    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNum1 = scanner.nextInt();
        System.out.println("Enter another number");
        int inputNum2 = scanner.nextInt();
        boolean compareNums = inputNum1 == inputNum2;

        if (inputNum1 > inputNum2) {
            System.out.println("Are numbers equal: " + compareNums);
            System.out.println(inputNum2 + " is less than " + inputNum1);
        } else if (inputNum1 < inputNum2) {
            System.out.println("Are numbers equal: " + compareNums);
            System.out.println(inputNum2 + " is greater than " + inputNum2);
        } else {
            System.out.println("Are numbers equal: " + compareNums);
            System.out.println(inputNum1 + " and " + inputNum2 + " are equal");
        }

    }
}
