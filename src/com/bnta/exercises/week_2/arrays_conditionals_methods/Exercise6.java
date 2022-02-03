///*
//    Create a package called email
//    Then have a method called validateEmail that return true of false if input is valid email
//    Finally invoke validateEmail in main
//        i.e. "hello@gmail.com" -> true
//        i.e. "hellogmail.com" -> false
//*/
//
//package com.bnta.exercises.week_two_mon;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class Exercise6 {
//
//    public static void main(String[] args) {
//        String uInput = getUserEmail();
//        Pattern pattern = Pattern.compile(getUserEmail());
//        Matcher matcher = pattern.matcher(getUserEmail());
//        boolean isSpecialCharacter = matcher.find();
//        if (isSpecialCharacter) {
//            System.out.println(uInput + " is a valid email");
//        }
//    }
//
//    public static String getUserEmail() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter email: ");
//        String emailInput = scanner.next();
//        return emailInput;
//    }
//
//    public static String validateEmail() {
//
//    }
//
//}
//
