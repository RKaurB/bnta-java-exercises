/*
Q8:  An 'if' within a 'for' loop

In this final example, let's go one more step further and introduce a 'for' loop to our previous answer (Q7).
The idea is to use a 'for' loop to check if the provided character is present at any point within our word.

- Create a String variable and assign it a value.
- Create a 'for' loop which wraps around your answer from Q7.
- Modify your 'if' statement to check the character at each index.
- Hint:  Use your internal, incrementing value of your 'for' loop within the '.charAt()' method.
- Print something to the console if the condition is met.

Once you get this working, try replacing using a word which contains your provided character multiple times (if you haven't already).
How does your application behave?  Do you have any unintended behaviour?

If you do have some unintended behaviours, such as additional printed statements, how could you fix them?
Hint:  The 'break' keyword.
 */

package com.bnta.exercises.week_2.basic_exercises.conditionals;

public class Exercise8 {

    public static void main(String[] args) {

        // Create a String variable and assign it a value.
        String word = "Test";
        // Target character variable
        char compareLet = 'E';
        boolean contains = true;

        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == compareLet || Character.toLowerCase(word.charAt(i)) == compareLet) {
                // Print something to the console if the condition is met/not met
                System.out.println(word + " contains " + Character.toLowerCase(compareLet) + " at index " + i);
            } else {
                contains = false;
            }
        }
        if (contains == false) {
            System.out.println("Nope");
        }
        // Create an 'if' statement which grabs the first letter of your word, and compares it against a Character value.
        // char compLet = 'l';
        // char compareLet = 't';

    }

}
