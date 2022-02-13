/*
Q7:  Create a loop that makes all words in an array uppercase, print the array

Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array.
Print the contents of the array in the terminal.

Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.

e.g.
public static void main(String[] args) {
    // create a for loop which goes through each string in our array
    // make each word uppercase
    // assign the value in the array to the uppercase string
    // print our resulting array
}
 */

package com.bnta.s04_working_with_loops;

import java.util.Arrays;

public class Exercise7 {

    public static void main(String[] args) {

        String[] arr = {"i", "sure", "do", "love", "bees"};

        // String capitalisedStr = "";
        // for (int i = 0; i < arr.length; i++) {
        //     capitalisedStr = arr[i].toUpperCase();
        //     System.out.println(capitalisedStr);
        // }

        // String[] capitalisedArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            // capitalisedArr[i] = arr[i].toUpperCase();
            arr[i] = arr[i].toUpperCase();
        }
        // System.out.println(Arrays.toString(capitalisedArr).toUpperCase());
        System.out.println(Arrays.toString(arr).toUpperCase());

    }

}
