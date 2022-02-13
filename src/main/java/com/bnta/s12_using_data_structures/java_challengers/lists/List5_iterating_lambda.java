/*
ITERATING OVER A LIST WITH A LAMBDA

To iterate elements with less code, we can also use a lambda expression.

(Note:  In Java 8, the forEach method was added in the List interface as a default method.)
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List5_iterating_lambda {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");
        // System.out.println(superheroes);                 // Print the toString method from the List

        // Use lambda
        // superheroes.forEach(e -> System.out.println(e));

        // Use method reference - better way to do the same thing - output will be the same as above
        superheroes.forEach(System.out::println);

    }

    /*
    Output:
        Batman
        Spider-Man
        Iron Man
    */
}


