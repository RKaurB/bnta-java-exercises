package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.time.LocalDate;

public class Section7_Methods {

    // com.bnta.s1_java_fundamentals_1.Main method
    // Public is the access modifier (could also be private, or package protected)
    // Then, static means that this method belongs to a class (and not an instance) - explained in more detail later
    // (Note: the static is optional)
    // Next, void is the return type - and void means that it doesn't return anything
    // Then we have the actual name of the method
    // And inside the brackets, we have some arguments - arguments are data/parameters that are passed into (received by) the method, that we can work with
    public static void main(String[] args) {
        // We can only use this if method returns something
        // (If the method does not return anything, then we cannot assign anything to it)
        // int x = incrementNumber(0);
        var x = incrementNumber(0);
        // Calls the print method
        print(x);
        // Calls getCurrentDate method
        var now = getCurrentDate();
        var dateMinus10days= getDateMinusDays(10);
        var dateMinus100days= getDateMinusDays(100);
    }

    // This method is missing the actual return type...
    // private static incrementNumber(int value) {}

    // If the method will have a return value (e.g. return value + 1), here we have to specify the return type (e.g. int if it returns an integer)
    private static int incrementNumber(int value) {
        return value + 1;
    }

    // This function does not return anything
    private static void print(int value) {
        System.out.println(value);
    }

    // This method does not accept anything/any value
    // It just returns the current local date
    private static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    private static LocalDate getDateMinusDays(int v) {
        return LocalDate.now().minusDays(v);
    }

}
