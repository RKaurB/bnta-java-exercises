///*
//LIST.OF JAVA CHALLENGE
//
//In the following Java Challenge, you will see the List.of method introduced on Java 9. With this method, it’s possible to add many elements into a list in just one line.
// */
//
//package com.bnta.week_4.ds.java_challengers.lists;
//
//import java.util.List;
//
//public class ListOf_challenge {
//
//    public static void main(final String... doYourBest) {
//        final List<String> soldiers = List.of("Tyrion", "Arya", "John");
//        if (soldiers.size() > 3) {
//            soldiers.add("Cersei");
//        } else {
//            soldiers.add("Bran");
//        }
//        System.out.println(soldiers);
//
//    }
//
//    /*
//    There is a crucial concept in the List.of method which is immutability. This means that we can’t add, change or remove any element from the List when we use the List.of() method. Immutable objects make code more reliable and less susceptible to bugs.
//    Therefore, in the if statement we are checking if the list has more than three elements which is false.
//    Then the else statement will be executed:
//        soldiers.add(“Bran”);
//    However, since we are trying to add an element to an immutable list, the following Exception will be thrown:
//        java.lang.UnsupportedOperationException
//     */
//
//}
