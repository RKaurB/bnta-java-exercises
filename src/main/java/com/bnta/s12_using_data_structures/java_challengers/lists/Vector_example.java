/*
VECTOR:

The Vector class is very similar to ArrayList with the difference that it is thread-safe. If you are working in a multi-thread environment and you don’t want data collision with other thread processes then Vector can be a better option.

Since Vector is synchronized, it’s also less performant than ArrayList. Vector also implements List
which means that we can use polymorphism at the same way as an ArrayList.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.List;
import java.util.Vector;

public class Vector_example {

    public static void main(String[] args) {

        List<String> vector = new Vector<>();                       // Instantiate the List with a Vector, making use of polymorphism
        vector.add("Batman");
        vector.add("Joker");
        vector.add("Robin");
        vector.add("Joker");

        int indexOfJoker = vector.indexOf("Joker");                 // Pass "Joker" and return the first found element's index number
        int lastIndexOfJoker = vector.lastIndexOf("Joker");      // Return the last position of "Joker"

        System.out.println(lastIndexOfJoker);                       // Print indexes
        System.out.println(indexOfJoker);

    }

    /*
    Output:
        3
        1
     */

}
