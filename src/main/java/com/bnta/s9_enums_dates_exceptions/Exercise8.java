/*
Q8:  Try catch
     - Run the below code and see what error you get:
           // int result = 10/10
     - Then surround it with try catch block and catch the exception that was thrown. Inside catch the catch block print "cannot divide by 0"
           try {
           } catch() {
           }
 */

package com.bnta.s9_enums_dates_exceptions;

public class Exercise8 {

    public static void main(String[] args) {
        // Surround with a try catch block to catch the exception that was thrown...
        try {
            int result = 10 / 0;                        // Running this code on its own produces an ArithmeticException error message
            // int result = 10 / 1;                     // Test where code works
            System.out.println("Result: " + result);    // Print result if code works
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by 0");   // Inside catch the catch block print "cannot divide by 0"
        }
    }

}
