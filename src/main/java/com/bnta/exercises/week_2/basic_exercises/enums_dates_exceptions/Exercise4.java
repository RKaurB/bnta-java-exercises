/*
Q4:  Print today's Date and Time using LocalDate
     Represent your date of birth using LocalDate
     Add 100 days to your dob and print it
 */

package com.bnta.exercises.week_2.basic_exercises.enums_dates_exceptions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Exercise4 {

    public static void main(String[] args) {

        // (i) Print today's Date and Time using LocalDate

        // LocalDateTime localDateTimeNow = LocalDateTime.now();
        // System.out.println("Current date and time: " + localDateTimeNow);

        LocalDate currentLocalDate = LocalDate.now();
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println("Current date: " + currentLocalDate);
        System.out.println("Current time: " + currentLocalTime);

        System.out.println();

        // Prints date and time together in a simpler format
        // https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java/5175900
        // DateFormat currentDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat currentDateTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println("Current date and time: " + currentDateTime.format(cal.getTime()));

        System.out.println();

        // (ii) Represent your date of birth using LocalDate

        LocalDate dob = LocalDate.of(1980, 12, 11);
        System.out.println("DOB: " + dob);

        // (iii) Add 100 days to your dob and print it

        LocalDate dobPlus100Days = dob.plusDays(100);
        System.out.println("DOB plus 100 days: " + dobPlus100Days);

    }

}
