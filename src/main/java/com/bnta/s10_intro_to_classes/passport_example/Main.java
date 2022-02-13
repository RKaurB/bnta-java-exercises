// Modelling a passport

package com.bnta.s10_intro_to_classes.passport_example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Classes
        // String passportNumber = "123456";

        Passport ukPassport = new Passport("1234", "England (UK)", LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport("123499", "USA", LocalDate.of(2030, 1, 1));

    }

    static class Passport {

        // Properties
        String number;
        String country;
        LocalDate expiryDate;

        // Constructor
        public Passport(String number, String country, LocalDate expiryDate) {
            // this. refers to the current instance of the current class
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }

}
