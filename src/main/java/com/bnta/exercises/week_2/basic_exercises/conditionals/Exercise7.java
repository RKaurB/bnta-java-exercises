/*
Q7:  Checking the first letter of a string

In this example, we're going to try something a tad more involved...

Let's make an 'if' statement which checks if a String starts with a specified character.
In this example, try using the .charAt() method, which can be applied to strings within your 'if' statement.
Bear in mind that this method will yield a Character-type value, which will need to be compared against another Character within the condition.
To create an inline variable of Character type, try using single quotes (') instead of double quotes (").

- Create a String variable and assign it a value.
- Create an 'if' statement which grabs the first letter of your word, and compares it against a Character value.
- Print something to the console if the condition is met.

Can you think of a way to make this check case-insensitive?
 */

package com.bnta.exercises.week_2.basic_exercises.conditionals;

public class Exercise7 {

    // Main method
    public static void main(String[] args) {

        // Create a String variable and assign it a value.
        // String word = "test";
        String word = "Test";
        // Create an 'if' statement which grabs the first letter of your word, and compares it against a Character value.
        // char compLet = 'l';
        // char compareLet = 't';
        char compareLet = 'T';
        // if (word.charAt(0) == compLet) {
        // if (Character.toLowerCase(word.charAt(0)) == compareLet) {
        if (word.charAt(0) == compareLet || Character.toLowerCase(word.charAt(0)) == compareLet) {
            // Print something to the console if the condition is met.
            System.out.println(word + " starts with " + Character.toLowerCase(compareLet));
        } else {
            System.out.println(word + " does not start with " + Character.toLowerCase(compareLet));
        }
    }
}
