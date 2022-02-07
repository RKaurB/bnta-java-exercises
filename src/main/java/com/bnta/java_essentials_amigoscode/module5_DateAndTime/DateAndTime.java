// Available Date classes
// Available Zones
// Available Date methods

package com.bnta.java_essentials_amigoscode.module5_DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

    public static void main(String[] args) {

        // 1.  DATE CLASSES

        // The Date classes we will mostly be using are:
        // - ZoneDateTime
        // - LocalDateTime

        ZonedDateTime now = ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        Instant instant = Instant.now();

        System.out.println(now);
        // 2022-02-06T23:07:43.248161Z[Europe/London]
        System.out.println(nowLDT);
        // 2022-02-06T23:07:43.249107
        System.out.println(localDate);
        // 2022-02-06
        System.out.println(localTime);
        // 23:07:43.249136
        System.out.println(instant);
        // 2022-02-06T23:07:43.249192Z

        // 2.  ZONES (ZONE IDs)

        // LocalDateTime localDateTime = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Australia/West"));
        // To see all the available Zone IDs:
        // ZoneId.getAvailableZoneIds().forEach(System.out::println);

        // If we select Australia/West, and add to localDateTime above
        // and then print localDateTime...
        System.out.println(localDateTime);
        // Compare to our own current local date time
        System.out.println(LocalDateTime.now());
        // So this is how we can target specific zones
        // Very important to be aware of the ZoneID

        // 3.  DATE METHODS

        // Recall that we can can get the current time using LocalDateTime.now()
        // If we want to be more specific, e.g. to represent a date of birth
        LocalDate someDate = LocalDate.of(2000, Month.SEPTEMBER, 1);
        // Most of the time, we'll end up using the LocalDateTime - gives us some flexibility and can also specify timezone

        System.out.println(someDate.minus(2, ChronoUnit.DECADES));
        // 1980-09-01

        System.out.println(someDate.isAfter(now.toLocalDate()));
        // false
        // (because 2000 is not after now)

        System.out.println(someDate.getYear());
        // 2000
        System.out.println(someDate.getMonth());
        // SEPTEMBER
        System.out.println(someDate.getDayOfWeek());
        // FRIDAY

        // This all makes it very easy to work with dates in Java!

    }

}
