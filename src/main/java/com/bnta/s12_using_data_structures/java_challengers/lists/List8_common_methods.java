/*
COMMON/IMPORTANT METHODS

Important methods of a Collection:

    • boolean add(E e): Adds an element to a Collection
    • boolean remove(Object o): Removes an object from a Collection
    • boolean contains(Object o): Checks if an element is contained in the collection
    • default boolean removeIf(Predicate<? super E> filter) { ... }: Removes an element
    based on a condition we pass in the Predicate functional interface
    • default Stream<E> stream(): It’s possible to manipulate elements from a collection with a sequential stream.

Important methods of a List:

    • void add(int index, E element): Adds an element based on the index we pass
    • E get(int index): Retrieves an element by the index
    • boolean isEmpty();: Verifies if the list is empty
    • <T> T[] toArray(T[] a): Transforms the list to an array
    • boolean containsAll(Collection<?> c): Checks if the elements of a Collection is contained in the list
    • boolean addAll(Collection<? extends E> c): Adds all elements from another collection into the list
    • void clear();: It clears the list, it removes all the elements
    • int indexOf(Object o): Gets the index of an object of the list
    • int lastIndexOf(Object o): Gets the last index of an object. If there are more than one objects that are the same in the list, the last index will be retrieved.
    • static <E> List<E> of(E... elements): Creates an unmodifiable list with multiple elements.
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

public class List8_common_methods {

    public static void main(String[] args) {



    }
}
