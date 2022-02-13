/*
Q5:  Write a method that calculates age on any given date.
     Hint: subtract today's date[year] - date[year]
 */

package com.bnta.s09_enums_dates_exceptions;

import java.time.LocalDate;

public class Exercise5 {

    //**************************************************//
    //                    SOLUTION 1                    //
    //**************************************************//

    public static void main(String[] args) {
        // Call calculateAge method with date of birth, and save value in the variable yourAge
        // int yourAge = calculateAge(LocalDate.of(1984, 02, 05));
        // Print calculated age
        // System.out.println("You are " + yourAge);

        // Call calculateAge method with date of birth, and save value in the variable age
        LocalDate dob = LocalDate.of(1984, 2, 5);
        int age = calculateAge(dob);
        // Print calculated age
        System.out.println("You are " + age);

        // Add another print statement to wish user happy birthday if day and month of current date is equal to that of dob
        LocalDate currentDate = LocalDate.now();
        if (dob.getMonthValue() == currentDate.getMonthValue() && dob.getDayOfMonth() == currentDate.getDayOfMonth()) {
            System.out.println("Happy birthday!");
        }
    }

    public static int calculateAge(LocalDate dob) {
        // Current local date
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - dob.getYear();
        // If current date's month is less than dob's month, then subtract dob's year from current date's year (e.g. 2022 - 1984 = 38 years) and then subtract 1 from that (i.e. 37 years)
        // Also think about days in month...
        if (currentDate.getMonthValue() < dob.getMonthValue()) {
            // return age - 1;
            return age - 1;
        } else if (currentDate.getMonthValue() == dob.getMonthValue() && currentDate.getDayOfMonth() < dob.getDayOfMonth()) {
            // return age - 1;
            return age - 1;
        } else {
            // Else, simply subtract dob's year from current date's year (e.g. (2022 - 1984 = 38)
            return age;
        }
    }

 }


//**************************************************//
//                    SOLUTION 2                    //
//          Using Scanner to get user input         //
//**************************************************//

//    public static void main(String[] args) {
//        // Get user to input their date of birth in the correct format, and then parse into LocalDate dob variable
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter date of birth (YYYY-MM-DD): ");
//        String inputDOB = scanner.nextLine();
//        // Parse and save inputted dob into LocalDate variable
//        LocalDate dob = LocalDate.parse(inputDOB);
//        // Call calculateAge method and print out user's age
//        System.out.println("You are: " + calculateAge(dob));
//    }
//
//    public static int calculateAge(LocalDate dob) {
//        // Current local date
//        LocalDate currentDate = LocalDate.now();
//        int age = currentDate.getYear() - dob.getYear();
//        // If current date's month is less than dob's month, then simply subtract dob's year from current date's year (e.g. 2022 - 1984 = 38 years)
//        // Also think about days in month...
//        if (currentDate.getMonthValue() < dob.getMonthValue()) {
//            // return age - 1;
//            return age - 1;
//        } else if (currentDate.getMonthValue() == dob.getMonthValue() && currentDate.getDayOfMonth() < dob.getDayOfMonth()) {
//            // return age - 1;
//            return age - 1;
//        } else {
//            // Else, subtract dob's year from current date's year, and subtract 1 from the result
//            // (e.g. (2022 - 1984 = 37)
//            return age;
//        }
//    }


//**************************************************//
//                    SOLUTION 3                    //
//          Using Scanner to get user input         //
//               (using Period import)              //
//**************************************************//

//    public static void main(String[] args) {
//        // Get user to input their date of birth in the correct format, and then parse into LocalDate dob variable
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter date of birth (YYYY-MM-DD): ");
//        String inputDOB = scanner.nextLine();
//        // Parse and save inputted dob into LocalDate variable
//        LocalDate dob = LocalDate.parse(inputDOB);
//        // Call calculateAge method and print out user's age
//        System.out.println("You are: " + calculateAge(dob));
//    }
//
//    public static int calculateAge(LocalDate dob) {
//        // Current local date
//        LocalDate currentDate = LocalDate.now();
//        // Return the period (in years) between current date and user's dob
//        return Period.between(dob, currentDate).getYears();
//    }
//}


//**************************************************//
//    //                    SOLUTION 4                    //
//    //            (using ChronoUnit import)             //
//    //**************************************************//
//
//     public static void main(String[] args) {
//         // Call calculateAge method
//         calculateAge(LocalDate.of(1984,02,05));
//     }
//
//     public static void calculateAge(LocalDate dob) {
//         // Get years between dob and current date and store in variable age
//         // int age = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
//         long age = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
//         // Print age
//         System.out.println(age);
//     }


//**************************************************//
//                    SOLUTION 5                    //
//        (using ChronoUnit import and Scanner)     //
//**************************************************//

//    public static void main(String[] args) {
//        // Get user to input their date of birth in the correct format, and then parse into LocalDate dob variable
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter date of birth (YYYY-MM-DD): ");
//        String inputDOB = scanner.nextLine();
//        // Parse and save inputted dob into LocalDate variable
//        LocalDate dob = LocalDate.parse(inputDOB);
//        // Call calculateAge method
//        // calculateAge(LocalDate.of(1984,02,05));
//        calculateAge(dob);
//    }
//
//    public static void calculateAge(LocalDate dob) {
//        // Get years between dob and current date and store in variable age
//        // int age = (int) ChronoUnit.YEARS.between(dob, LocalDate.now());
//        long age = ChronoUnit.YEARS.between(dob, LocalDate.now());
//        // Print age
//        System.out.println("You are " + age);
//    }
//}

