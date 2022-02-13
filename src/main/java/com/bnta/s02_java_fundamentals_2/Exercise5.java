package com.bnta.s02_java_fundamentals_2;

    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac com.bnta.exercises.week_1.java_fundamentals.Exercise5.java | java com.bnta.exercises.week_1.java_fundamentals.Exercise5 foo bar baz
     */

public class Exercise5 {

    public static void main(String[] args) {
        // loop through args here
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}
