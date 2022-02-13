package com.bnta.s01_java_fundamentals_1;

public class Day6 {
    public static void main(String[] args) {
        String[] names = {"Wendy", "Linda", "Hajr"};

        // int i = 0;
        // while (i < names.length) {
        //    System.out.println(names[i]);
        //    i++;
        // }

        // Do while loop
        // runs at least once
        int i = 0;
        do {
            System.out.println(names[i]);
            i++;
        } while(i < names.length);
    }
}
