/*
ARRAYLIST

The most used implementation of List in real projects is certainly ArrayList.
ArrayList is has good performance to accessing data with the get and set methods because elements are indexed.
(Behind the scenes an ArrayList actually stores an array of objects.)

An array in any programming language has to have pre-allocated size in memory. Since behind the scenes in the ArrayList we use the type Object[] elementData, we also have to have an initial capacity. In the case of ArrayList, the DEFAULT_CAPACITY is used. Therefore, whenever you add more elements than the array’s capacity, a new array with the double of the capacity will be created since it’s not possible to change an existing array’s capacity.

To add elements in an array while the defined capacity is not reached is quick but when the capacity is reached then it’s necessary to copy the existing array elements into a new array which makes it a bit slow.

ArrayList is not synchronized, which means that it’s not safe to use in a multi-thread environment because you might have data collision. However, because ArrayList is not synchronized, it’s also more performant.

IMMUTABILITIY WITH ARRAYLIST:

The concept of immutability is very important because the less point of changes in code, the fewer points of bugs. Bugs are stressful and make developers’ life miserable. To create immutable objects, this means, objects that don’t change state makes your application easier to handle. Fortunately, there are some ways to create a List that is immutable.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylist_about {

    public static void main(String[] args) {

        // 1.  LIST.OF
        // The List.of method can make things easier when creating an array. However, note that it creates an immutable list.

        // List<String> superheroes = List.of("Batman", "Super Man", "Wonder Woman");
        // superheroes.add("Robin");
        // Produces error message:  Exception in thread "main" java.lang.UnsupportedOperationException

        // whenever we have an immutable Collection, we can’t add, delete or change the list object in any way.
        // If we really need to change the data we would need to create another ArrayList object...
        List<String> superheroes = List.of("Batman", "Super Man", "Wonder Woman");

        superheroes = new ArrayList<>(superheroes);
        superheroes.add("Robin");
        superheroes.forEach(System.out::println);       // For each, using method reference

        /* Output:
            Batman
            Super Man
            Wonder Woman
            Robin
         */

        // 2. ARRAYS.ASLIST
        // The Arrays.asList method is similar to the List.of method and has the same behaviour.
        // It will add elements to it and will return an immutable List.

        List<String>otherSuperheroes= Arrays.asList("Batman","SuperMan","WonderWoman");
        otherSuperheroes.add("Robin");
        superheroes.forEach(System.out::println);
        // Again, produces error message:  Exception in thread "main" java.lang.UnsupportedOperationException

    }

}
