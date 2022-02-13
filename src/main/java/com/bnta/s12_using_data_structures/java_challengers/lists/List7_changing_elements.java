package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List7_changing_elements {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");

        // Change the element located at the index passed - i.e. he first element (Spider-Man) is changed to Wolverine
        superheroes.set(0, "Wolverine");

        System.out.println(superheroes);                 // Print the toString method from the List

    }
    /*
    Output:
        [Wolverine, Spider-Man, Iron Man]
     */

}
