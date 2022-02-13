/*
Q 6:  Write a method which takes an array of strings as an argument and returns the number of items in the array.
 */

package com.bnta.s05_writing_methods;

public class Exercise6 {

    public static void main(String[] args) {
        String[] arr = {"one", "two", "three"};
        System.out.println(numItems(arr));
    }

    public static int numItems(String[] items) {
        return items.length;
    }

}
