/*
Q3:  Invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value.
     Hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase.
 */

package com.bnta.s09_enums_dates_exceptions;

public class Exercise3 {

    public static void main(String[] args) {

        for (int i = 0; i < TshirtSize.values().length; i++) {

            System.out.println(TshirtSize.values()[i].name().toLowerCase());

        }

    }

}
