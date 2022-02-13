/*
LIST:

The List interface is the most used Collection interface in the day-to-day work of a Java developer.

- We can add many elements in the list
- We can access elements quickly by index
- Elements are ordered in the way they are inserted.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List1_create_list {

    public static void main(String[] args) {

        // Instantiate List with ArrayList (using polymorphism)
        // Note:  ArrayList is the most used Collection in real Java projects
        // Passes the generic type of String to the list - means we can only add String to it
        List<String> superheroes = new ArrayList<>();

        // Add String elements in the list
        superheroes.add("Batman");
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");

        // Print the toString method from the List (implemented in the AbstractCollection class)
        System.out.println(superheroes);
    }

    /*
    Output:
        [Batman, Spider-Man, Iron Man]
     */
}
