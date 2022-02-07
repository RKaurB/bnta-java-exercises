// How to handle errors in Java

// Errors happen all the time in the real world
// e.g. invalid user input, or external system that is not responding, or simply any programming error
// These errors happen at runtime, and our program needs to be able to handle those errors, so that it can keep on running our application
// whether the exception happens or not - because we don't want our application to crash!

// So, in Java we have exception handling...

package com.bnta.java_essentials_amigoscode.module8_Exceptions;

public class Exceptions {

    public static void main(String[] args) {

//        String brand = "amigoscode";
//        // Get length of the characters in brand variable
//        System.out.println(brand.length());
//        // Length: 10

        // But, if we assign brand = null...
        String brand = null;
        // When we attempt to get length of the characters in brand variable...
        // System.out.println(brand.length());
        // We get a NullPointerException error message!

        // In Java, there is a class called Exception, and this is the root of all other exceptions
        // (Correction:  this is wrong, Throwable is actually the root)

        try {
            System.out.println(brand.length());
//        } catch (NullPointerException e) {
        } catch (Exception e) {          // this will still work, in cases where we don't know which exception will occur

            // This is the default behaviour if an error occurs
            System.out.println("Brand was null\n" + e);
        }
    }


}
