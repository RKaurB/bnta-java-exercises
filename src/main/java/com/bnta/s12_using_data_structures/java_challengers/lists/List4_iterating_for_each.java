/*
ITERATING OVER A LIST WITH forEach

We can also use the forEach or enhanced looping concept.
This looping will literally do the same as the Iterator, but that will happen behind the scenes.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.List;

public class List4_iterating_for_each {

    public static void main(String[] args) {

        List<String> superheroes = new ArrayList<>();       // Instantiate List with ArrayList
        superheroes.add("Batman");                          // Add String elements in the list
        superheroes.add("Spider-Man");
        superheroes.add("Iron Man");
        // System.out.println(superheroes);                 // Print the toString method from the List

//        Iterator iterator = superheroes.iterator();         // Iterator to traverse the list
//        while (iterator.hasNext()) {                        // Verifies if there is a next element in the iterator
//            String superhero = (String) iterator.next();
//            System.out.print(iterator.next() + " ");        // While there is a next element, print (with a space after)

        // Retrieves String from superheroes, and puts each of them into a String variable
        for (String superhero : superheroes) {
            System.out.print(superhero + " ");                // Prints each superhero with a space after
        }

    }

        /*
    Output:
        Batman Spider-Man Iron Man
     */

}
