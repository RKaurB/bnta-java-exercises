/*
Q6:  Try catch
     Write a program that converts program arguments to an integer
     - if value cannot be converted to int store them somewhere
     - calculate sum for numbers that can be converted to an integer
     - finally print the numbers that cannot be converted to an int
     - example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
     - output: Sum: 6 and a, b, foo are not numbers.
 */

package com.bnta.exercises.week_2.basic_exercises.enums_dates_exceptions;

import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        String[] stringArr = {"1", "2", "a", "b", "foo", "3"};

        int sum = 0;

        String notConvertedToInt = "";
        String convertedToInt = "";

        for (int i = 0; i < stringArr.length; i++) {
            try {
                // convertedToInt += Integer.parseInt(stringArr[i]) + " ";
                convertedToInt += Integer.parseInt(stringArr[i]) + ", ";
                sum += Integer.parseInt(stringArr[i]);
            } catch (Exception e) {
                // notConvertedToInt += stringArr[i] + " ";
                notConvertedToInt += stringArr[i] + ", ";
            }
        }

        // System.out.println("Sum of integers [" + convertedToInt + "]: " + sum);
        System.out.println("Sum of integers [" + convertedToInt.substring(0, convertedToInt.length() - 2) + "]: " + sum);
        // System.out.println("Not able to convert to integers: " + notConvertedToInt);
        System.out.println("Not able to convert to integers: " + notConvertedToInt.substring(0, notConvertedToInt.length() - 2));

    }

}
