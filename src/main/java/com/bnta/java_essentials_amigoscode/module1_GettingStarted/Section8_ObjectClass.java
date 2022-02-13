// In Java, we have a special class which is the root of every other class - the Object class!

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.awt.*;

public class Section8_ObjectClass {

    public static void main(String[] args) {
        // Although String name = "Jamil" is the more precise way of doing things, this is an object
        // Object name = "Jamil";
        // String name = "Jamil";
        // Object[] name = {"Jamil"};
        // Object p = new Point();
        Point p = new Point();
        // All of the methods of the Object class are in every single other class - i.e. every other class shares the exact same methods

        // System.out.println(name);
        // System.out.println(name.hashCode());

        // This works because Object is the root of every other class
        // But it doesn't really make sense to do so
    }

}
