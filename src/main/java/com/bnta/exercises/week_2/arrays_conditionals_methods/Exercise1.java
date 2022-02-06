/* Write a method that reverses any String and print to console
   Input should be a string
   Output should be reversed input
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

public class Exercise1 {

    public static void main(String[] args) {

        // https://www.codegrepper.com/code-examples/java/how+to+print+a+string+in+reverse+java
        // String input = "hello";
        // for (int i = input.length() - 1; i >= 0; i--) {
            // System.out.println(input.charAt(i));

        // invoke the method, with desired string input
        reverse("testing");
        }

    public static void reverse(String input) {
        // Initialise the output variable
        String output = "";
        // loop through the input string, starting at the last character in the string, iterating through while i is greater than/equal to 0, with i decrementing by 1 on each iteration
        for (int i = input.length() - 1; i >= 0 ; i--) {
            // on each iteration, add that character to the output string
            output += input.charAt(i);
        }

        // once loop has finished, print final output string
        // should be reversed input string!
        System.out.println(output);
    }

}

