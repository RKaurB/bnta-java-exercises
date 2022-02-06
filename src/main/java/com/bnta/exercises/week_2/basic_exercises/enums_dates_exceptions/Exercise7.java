/*
Q7:  Create a method that sums days of the month for a given array of LocalDate
 */

package com.bnta.exercises.week_2.basic_exercises.enums_dates_exceptions;

// Import LocalDate
import java.time.LocalDate;

public class Exercise7 {

    // Main method
    public static void main(String[] args) {
        // Create array of local dates
        LocalDate[] dates = {LocalDate.of(2022, 2, 6), LocalDate.of(2020, 7, 14), LocalDate.of(1998, 10, 5)};
        // Call sumDaysOfMonth method, and print the sum of the days of month for the given array of local dates
        System.out.println("Total days of month: " + sumDaysOfMonth(dates));
    }

    // sumDaysOfMonth method
    // This method sums days of the month for a given array of LocalDate
    static int sumDaysOfMonth(LocalDate[] dates) {
        // Create and initialise variable to store the sum of the days of month
        int sum = 0;
        // Loop over the dates in the dates array, get each days of month value from each date, and add to the sum variable
        for (int i = 0; i < dates.length; i++) {
            int daysOfMonth = dates[i].getDayOfMonth();
            sum += daysOfMonth;
        }
        // Return the total sum
        return sum;
    }

}
