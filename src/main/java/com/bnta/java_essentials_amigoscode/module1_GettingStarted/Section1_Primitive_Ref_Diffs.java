/*
Section 1:  Primitive and Reference Types differences
https://amigoscode.com/courses/1119429/lectures/23980193
 */

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

public class Section1_Primitive_Ref_Diffs {

    public static void main(String[] args) {

        // (i) PRIMITIVES

        // Define variables
        int a = 10;
        int b = a;

        // Change the actual value of a, to 100;
        a = 100;
        // and then print both a and b
        System.out.println("a = " + a + " and " + "b = " + b);        // a = 100 and b = 10

        // Note that the final value of a is 100, and b is 10 (above)
        // When we say that b = a, the value of a (10) that goes into b, is passed by copy - i.e. it's a copy of a (stored in a different memory location)
        // This means that, if we then change a, the value of b is untouched (because b lives in a different memory address)

        // However, this is a little bit different with Reference types

        // (ii) REFERENCE TYPES
        // (See below Person class)

        // Create a new Person, alex
        Person alex = new Person("alex");
        // Create a second Person, mariam
        Person mariam = alex;

        // Note that, with reference types, these objects are stored differently in memory.
        // E.g. the actual Object (Person("Alex")) is stored in one address in memory; then we have the actual thing, alex (in a different memory location), and this is a reference to our Object.
        // Then, we also created mariam (also a reference type, and stored in a different memory address) and we said that mariam is equal to alex - so now, instead of pointing directly to alex's address, it will simply point to the Object (Person("Alex")) address.
        // (So both alex and mariam are pointing to the initial Object.)
        // This is an important distinction!
        // Illustrated below

        System.out.println("Before changing alex: ");
        System.out.println(alex.name + " " + mariam.name);

        // Change only alex name
        alex.name = "Alexander";
        // What will the value of mariam now be?
        // We might expect mariam to be untouched, but this isn't the case! (see below)

        System.out.println("After changing alex: ");
        System.out.println(alex.name + " " + mariam.name);
        // Instead, after changing alex, we get: Alexander Alexander
        // And this is because they are pointing to the same reference
        // The same would happen if we changed mariam.name = "Mariam" - we would then get: Mariam Mariam

    }

    // This is a class that can create reference types, or simply, objects
    static class Person {

        String name;

        Person(String name) {
            this.name = name;
        }
    }


}

