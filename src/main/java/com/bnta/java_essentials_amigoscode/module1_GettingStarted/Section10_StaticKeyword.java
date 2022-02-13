// The static keyword will be used often, and we should understand what it is...

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.util.ArrayList;

public class Section10_StaticKeyword {

    // If we now want to access this BRAND here, we can simply call Section10_StaticKeyword
    // public static final String BRAND = "amigoscode";            // 6.

    public static String BRAND;                       // 7.
    static ArrayList list;                            // 8.

    // Also, with statics we have this static block here, which is used to initialise any static which we have
    // e.g. see above public static String BRAND
    // So, static keyword is used for initalising things
    static {                                          // 7.
        BRAND = "amigoscode";                         // 7.
        list = new ArrayList();                       // 8.
        list.add("");                                 // 8.
    }

    // This is the entry point of every single Java program
    // and this has to be static (it cannot be run without static)
    // Whether it is a method or a variable, static means that it belongs to the class itself
    // Usually it is used to have some shared data across all the objects
    public static void main(String[] args) {
        // new Person("alex");
        // Extracted to a variable, this becomes...
        Person alex = new Person("alex");             // 3.
        Person bob = new Person("bob");               // 3.
        // The cool thing about having static in the Person class (below), is that the variable createdPeople is shared amongst all the objects
        // e.g. if we want to know how many people we have created so far, we can simply say...
        System.out.println(Person.createdPeople);           // 4.
        // ... because the static is shared across all objects
        // i.e. createPeople does not belong to alex or bob - it belongs to the Person class
        // If we run this, we then get 2 (i.e. there are 2 people created - alex and bob)
        System.out.println(alex.name);                      // 5.
        System.out.println(bob.name);                       // 5.
        // If we then print out alex.name and bob.name, we can see that each object is independent from itself
        // but the static value (createdPeople variable) is shared across those two objects
        // So this is one way of using statics

        // Another way is to define constants...            // 6.
    }

    // Person class - here we are defining a way of creating people!
    // We need to have the static keyword here
    // This is because we're going to use this class directly inside of the above static method
    // So, if we're not going to create an instance outside, this has to be static
    static class Person {
        // This variable here tracks the number of people that we create from this class
        static int createdPeople = 0;       // 1.
        // Create name variable
        String name;                        // 2.
        // Constructor
        // Here, we are creating a Person, and then we are incrementing the number of people
        Person(String name) {                       // 1.
            // Section10_StaticKeyword.BRAND;       // 6.
            this.name = name;                       // 2.
            createdPeople++;                        // 1.
        }
    }

}
