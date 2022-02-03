/*
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit
*/

package com.bnta.exercises.week_2.arrays_conditionals_methods;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        printMenu();
        Scanner n = new Scanner(System.in);
        String input = n.nextLine();
        String joke = "";
        String output = "you";

        if (input.equals("Yes") || input.equals("yes")) {
            Yes();
            printMenu();
        } else if (input.equals("No") || input.equals("no")){
            System.out.println("no joke for you!");
        } else {
            System.out.println("bye!");
        }
    }

    private static void Yes() {
        System.out.println("You");
    }

    public static void printMenu() {
        System.out.println("Want to hear a joke?");
        System.out.println("Yes/No");
    }
}
