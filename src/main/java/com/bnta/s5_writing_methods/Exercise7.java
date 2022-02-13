/*
Q7:  Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".

HINT: Remember what you've done already, you might be able to reuse one of your methods here...
 */

package com.bnta.s5_writing_methods;

public class Exercise7 {

    public static void main(String[] args) {
        countWords("How many words in this sentence");
    }

    public static void countWords(String sentence) {
        String[] words = sentence.split(" ");
        int count = words.length;
        System.out.println("The sentence contains " + count + " words.");
    }

}
