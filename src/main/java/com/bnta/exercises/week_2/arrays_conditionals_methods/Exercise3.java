/*
  Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
  You might compile and run the program via command line or by editing configuration and pass program arguments
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        System.out.println(oddOrEven(num));
    }

    public static String oddOrEven(int num) {
        // String result = "";
        String result;
        if (num % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        return result;
    }
}

