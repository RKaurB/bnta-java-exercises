package com.bnta.s1_java_fundamentals_1;
//import java.awt.*;
import java.awt.Point;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello");

        // primitives
        // byte age = 128;
        // int age = 21;
        // long age2 = 50_000_000;
        // double pi = 3.14159;
        // boolean isAdult = true;
        // String name = "Alex";
        // char letter = 'C';

        //System.out.println(10 + 10);
        //System.out.println(10 - 10);
        //System.out.println(10 * 10);
        //System.out.println(10 / 10);
        //System.out.println(10 % 4);

        // BODMAS rules
        // System.out.println((10 + 10) * 10 * 2 + (10 / 2));

        //int number = 0;  // 0

        // return and increment the number by 1
        // number = number + 1;
        //System.out.println(number++);
        //System.out.println(number);

        // returns and decrements
        //System.out.println(number--);
        //System.out.println(number);

        // decrement and return
        // replaces in number with -1
        //System.out.println(--number);
        //System.out.println(number);

        // Example exercise:
        //System.out.println(number--);   // print 0 and then decrement
        //System.out.println(number--);   // print -1 and then decrement
        //System.out.println(number++);   // print -2 and then increment
        //System.out.println(--number);   // decrement and print -2
        // System.out.println(number);     // print -2

        //System.out.println(number-- + " " + number);

        //System.out.println(1);
        //System.out.println(3);
        //System.out.println(45);
        //System.out.println(6);

        // Reference types

        // int x = 0;
        // int y = 1;

        // Point point = new Point(10,10);  // might be used, e.g. to implement Snake game
        // System.out.println(point);

        //int number = 0;
        //int number2 = number;  //takes a copy of number and stores it into number2
        //These are separate numbers, so if say number++ only affects number (not number2)
        //Note: with primitives, it always takes a copy

        // number++;

        //System.out.println(number);
        //System.out.println(number2);

        // ANOTHER EXAMPLE:
        //Point p1 = new Point(10,10);
        //Point p2 = p1;

        //p2.x = 0;  // even though we changed p2, p1 is affected (?)

        //System.out.println(p1);
        //System.out.println(p2);

        // Prints out:
        //java.awt.Point[x=0,y=10]
        //java.awt.Point[x=0,y=10]

        // STRINGS...

        //String linda = "Rosa";
        // String linda = "Linda";
        // String x = linda;

        // x = "Foo";

        //System.out.println(linda);
        //System.out.println(x);

        // System.out.println(linda == x);  //true

    /*
       Write a program that takes arguments from the program args and loops through args and prints each item in args
       Compile using: javac and run using: java
       i.e. javac com.bnta.exercises.week_1.java_fundamentals.Exercise5.java | java com.bnta.exercises.week_1.java_fundamentals.Exercise5 foo bar baz
     */

        // loop through args here
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}

