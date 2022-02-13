/*
ITERATING OVER A LIST WITH ITERATOR

Iterating elements of a List with Iterator is quite verbose.
However, using Iterator might be useful when we need to use a while looping asking if the next element is present.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List3_iterating_iterator {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");
        // System.out.println(superheroes);                 // Print the toString method from the List

        Iterator iterator = superheroes.iterator();         // Iterator to traverse the list
        while (iterator.hasNext()) {                        // Verifies if there is a next element in the iterator
            System.out.print(iterator.next() + " ");        // While there is a next element, print (with a space after)
        }
    }

    /*
    Output:
        Batman Spider-Man Iron Man
     */

}
