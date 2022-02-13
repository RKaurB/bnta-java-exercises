/*
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    For e.g.
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit
*/

package com.bnta.s06_arrays_conditionals_methods;

// Import Random and Scanner methods
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {

    // Main method
    public static void main(String[] args) {

        // Create array of bad science jokes
        String[] jokesArray = {
                "I was reading a book on helium. I couldn't put it down!",
                "A photon checks into a hotel, and is asked if he needs any help with his luggage. 'No', he says, 'I'm traveling light'.",
                "I heard that oxygen and magnesium were going out, and I was like O Mg.",
                "One tectonic plate bumped into another and said 'sorry, my fault!'",
                "How do you organise a space party? You planet!",
                "Never trust an atom. They make up everything."
        };

        // Initialise boolean variable joke to true
        boolean joke = true;

        // While true, prompt user to enter yes or no to hear a joke
        // While true, read input (to lowercase) and call the isJoke method accordingly
        while (joke) {
            System.out.println("Want to hear a joke? (yes/no)");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toLowerCase();
            joke = isJoke(input, jokesArray);
        }
    }

    // isJoke method, takes string input (yes/no) and jokes (string) array as input
    // and returns a boolean value (true/false)
    static boolean isJoke(String input, String[] jokes) {
        // if input is yes or y, select and print random joke from jokes array, and return true
        // else if input is no or n, bid user goodbye
        // else, if input is neither yes/y/no/n, then flag as invalid input and prompt user again
        if (input.equals("yes") || input.equals("y")) {
            Random random = new Random();
            int randomJoke = random.nextInt(jokes.length);
            System.out.println(jokes[randomJoke]);
            return true;
        } else if (input.equals("no") || input.equals("n")){
            System.out.println("Bye!");
            return false;
        } else {
            System.out.println("Invalid input.");
            return true;
        }
    }
}
