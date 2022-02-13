/*
Q3:  Print each line from an input file

- Create a File object from a text file.
- Create a Scanner object from our File object.
- Create a loop which checks whether there is still some unused input.
- Create a local variable which is assigned to the next line of the input.
- Print the line to the console.
 */

// https://home.csulb.edu/~pnguyen/cecs277/lecnotes/pp/ch07.pdf
// https://stackoverflow.com/questions/31106118/try-and-catch-error-in-java
// https://www.baeldung.com/java-exceptions

package com.bnta.s08_scanners;

// Import File and Scanner classes
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        printLinesFromFile();
    }

    public static void printLinesFromFile() {
        // Create a File object from a text file
        File file = new File("/Users/rachelkaur/testinputfile.txt");
        // Create a Scanner object from our File object

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create a loop which checks whether there is still some unused input
        while (scanner.hasNext()) {
            // Create a local variable which is assigned to the next line of the input
            String input = scanner.nextLine();
            // Print the line to the console
            System.out.println(input);
        }
    }

}
