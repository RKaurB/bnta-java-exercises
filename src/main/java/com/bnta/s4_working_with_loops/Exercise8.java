/*
Q8:  Create a loop that capitalises each word in an array, prints the new array

Start with the array: ["i", "sure", "do", "love", "bees"]. Create a for loop which makes each word uppercase in the array.
Print the contents of the array in the terminal.

Hint: You could make use of the .charAt() method to grab a specific character (letter) at the specified index
Hint: You could make use of the .substring() method which works on strings to grab the part of a given string forward from the specified index

e.g.
public static void main(String[] args) {
    // create a for loop which goes through each string in our array
    // grab the first letter of our word
    // capitalise the first letter
    // add the capitalised letter to the rest of the provided word
    // assign the value to an array
    // print our resulting array
}
 */

package com.bnta.s4_working_with_loops;

import java.util.Arrays;

public class Exercise8 {

    public static void main(String[] args) {

        String[] arr = {"i", "sure", "do", "love", "bees"};
        // Create a for loop which goes through each string in our array
        for (int i = 0; i < arr.length; i++) {
            // Capitalise the first letter (charAt(0)) of the word (arr[i])
            // and then re-join with the rest of the string (substring from the second letter of the word)
            // and replace the original word (arr[i]) with the capitalised word
            arr[i] = Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1);
        }

        // Convert array to string and print
        System.out.println(Arrays.toString(arr));

    }

}
