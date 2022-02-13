/*
DEQUE & STACK:

The Deque interface has all the capabilities of the legacy Stack class from Java 1.0.
It’s also recommended to use Deque instead of Stack whenever you need to use Stack functionalities.

Just imagine how you would pile up your plates in your kitchen one on the top of the other, getting the easiest accessible plate from the pile (Last-in First-out):
    _/ <- Put the last plate on the top (Last-in) _/
    __/
    _/ _/ <- Remove the first plate (First-out) __/

As the name suggests, a Deque has the behaviours of a double ended queue, which means that we can use it as a stack or a queue. In other words, we can add or delete the first or the last element.

This is how we might use a Deque with stack capabilities (Last-in First-out)...
 */

package com.bnta.s12_using_data_structures.java_challengers.lists;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_Stack_example {

    public static void main(String[] args) {

        //  DEQUE LINKED LIST

        // Create LinkedList, with the capabilities to work as double-linked stack or queue
        // (Note: using Deque interface as the type of the LinkedList implementation.)
        Deque<String> deque = new LinkedList<>();

        deque.push("Wolverine");
        deque.push("Storm");
        deque.push("Xavier");
        deque.push("Juggernaut");

        // Print before popping...
        System.out.println(deque);

        // Removes the first element of the stack (First-out) - i.e. "Juggernaut")
        deque.pop();

        System.out.println(deque);



    }
}
