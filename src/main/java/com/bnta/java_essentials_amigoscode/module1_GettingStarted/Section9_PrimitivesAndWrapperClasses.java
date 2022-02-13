// Primitives and their Objects

// We already learned about primitives, and how we pass them inside of methods, i.e. by value or by reference
// And we know internally how they work

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

public class Section9_PrimitivesAndWrapperClasses {

    public static void main(String[] args) {
        // This is a primitive, so if we say number. we don't get any methods associated with it
        int number1 = 1;
        // So, if we want to work with this integer in an Object oriented way, we can use the Object version of integers
        // i.e. Integer (instead of int)
        Integer number2 = new Integer(1);
        Integer number3 = 1;    // or, this is exactly the same thing!
        // We now have methods that we can work with, e.g.
        // number3.

        // For every single primitive, we have the Object equivalent

        // If we have a list of numbers...
        // List numbers = null;
        // If we then want to say that this list can can only contain whole numbers, we need to use generics...
//        List<Integer> numbers = null;
//        numbers.add(1);
//        numbers.add("1");  // this now throws an error, we can't use it
//
//        // double > Double
//        // long > Long
//        // int > Integer

        // int number = null;          // this doesn't work, however...
        Integer number = null;      // if we were expecting nulls, we could do this instead
        // (We will learn about null pointer exceptions etc later)

    }

}
