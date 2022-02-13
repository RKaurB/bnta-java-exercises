/*
ITERATING OVER A LIST WITH INDEX:

One of the greatest advantages of a list is to access elements by index.

This example creates a for looping accessing the index of each element...
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List2_iterating_index {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");
        System.out.println(superheroes);                    // Print the toString method from the List

        // For loop, iterates up until the list size, and increments i on each iteration
        for (int i = 0; i < superheroes.size(); i++) {
            // Get each element by index and print
            System.out.println(superheroes.get(i));
        }

        /*
        Output:
            Batman
            Spider-Man
            Iron Man
        */



    }


}
