package com.bnta.s02_java_fundamentals_2;

/*
   Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

   Tip:
    - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
    - create variable to store result. double result = 0;
    - convert string to array.
    - then loop.
    - convert each string to decimal and add to current result
*/

public class Exercise4 {

    public static void main(String[] args) {

        // string input
        String inputStr = "0.90, 1.00, 9.00, 8.78, 0.01";
        // convert string to array
        String[] inputArr = inputStr.split(", ");
        // declare variable to store double value
        double totalAmount = 0;
        // sets i to 0 on first iteration, then loops through the length of the array, incrementing by 1 on each iteration
        for (int i = 0; i < inputArr.length; i++) {
            String inputNumber = inputArr[i];
            // covert each string to double
            double inputDouble = Double.parseDouble(inputNumber);
            // add to current result
            totalAmount += inputDouble;
        }

        // print out total amount
        System.out.println(totalAmount);

    }

}
