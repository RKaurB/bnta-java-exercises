package com.bnta.s01_java_fundamentals_1;

public class Day6_operators {
    public static void main(String[] args) {

        // boolean result = 20 == 20 && 30 == 31;
        // boolean result = 20 == 20 && 30 == 31 && ("linda".equals ("Linda") || 10 == 10);
        // boolean result = 20 == 20 && 30 == 30 && ("linda".equals ("Linda") || 10 == 10);
        // boolean result = 20 == 20 || 30 == 31;
        // System.out.println(result);

        // if (true) {
        //    System.out.println("Hooray!");
        // }

        String hello = "  OLA  ";

        // if (hello.equals("Ola")) {
        //    System.out.println("Portugese");
        // } else if (hello.equals("Hello")) {
        //    System.out.println("English");
        // } else {
        //    System.out.println("I don't know");
        // }

//        switch (hello) {
//            case "Ola":
//                System.out.println("Portugese");
//                break;
//            case "Ciao":
//                System.out.println("Italian");
//                break;
//            default:
//                System.out.println("Oops, I don't know");
//        }

        switch (hello.trim().toLowerCase()) {
        case "Ola":
            System.out.println("Portugese");
            break;
        case "Ciao":
            System.out.println("Italian");
            break;
        default:
            System.out.println("Oops, I don't know");
    }
    }
}
