package com.bnta.exercises.week_1.java_fundamentals;/*
    Write a program that reverses an array of Strings
    String[] content = {"you", "are", "how", "hello"}
    Tip. Use for loop and you to start at highest index.
    Output should be: hello how are you?. Note question mark at the end
*/

public class Exercise3 {
    public static void main(String[] args) {

        String[] strContent = {"you", "are", "how", "hello"};

        // print array in order
        // for (int i = 0; i < strContent.length; i++) {
        //     System.out.println(strContent[i]);
        // }

        // print array in reverse
        String reversedStr = "";
        // start at the end of the array (strContent.length - 1)
        // keep looping while i is greater than or equal to zero
        // and decrement by 1 each time
        for (int i = strContent.length - 1; i >= 0; i--) {
            System.out.println(strContent[i]);
            reversedStr += strContent[i] + "";
        }
    }
}