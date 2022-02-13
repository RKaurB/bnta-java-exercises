/*
  Write a program that takes an input number from the console and prints if number is prime
  Create a method to check if number is prime then use against the input
*/

package com.bnta.s06_arrays_conditionals_methods;

import java.util.Scanner;

public class Exercise4 {

    // MAIN FUNCTION
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        // Use Scanner to get and read user input
        Scanner input = new Scanner(System.in);
        // Store that input in a variable (int)
        int num = input.nextInt();
        // Call isPrimeNums method, and print out the result
        // System.out.println("This number [" + num + "] is " + oddOrEven(num));
        if (isPrimeNums(num)) {
            System.out.println(num + " is a prime number!");
        } else {
            System.out.println(num + " is not a prime number!");
        }
    }

        // PRIME NUMBERS METHOD
        // What is a prime number?
        // a number that is divisible only by itself and 1 (e.g. 2, 3, 5, 7, 11)
        public static boolean isPrimeNums(int num){

            // If number is less than or equal to 1, return false
            if (num <= 1) {
                return false;
            }

            // Check from 2 to number-1
            for (int i = 2; i < num; i++) {
                // If remainder of number divided by i (num % i) is equal to 0, return false
                if (num % i == 0) {
                    return false;
                }
            }

            return true;

        }

    }

