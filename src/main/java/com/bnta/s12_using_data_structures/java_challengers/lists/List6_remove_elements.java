/*
REMOVING ELEMENTS FROM A LIST

To remove an element...
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List6_remove_elements {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");

        // Remove the element by index - i.e. first element, Batman
        superheroes.remove(0);
        // Remove the element by object value - i.e. Iron Man
        superheroes.remove("Iron Man");

        System.out.println(superheroes);                 // Print the toString method from the List

    }

    /*
    Output:
        [Spider-Man]
     */


}
