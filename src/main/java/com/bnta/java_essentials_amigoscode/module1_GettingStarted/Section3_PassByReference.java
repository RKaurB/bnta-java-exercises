// Recall then that we should never mutate primitive values - instead we should always return a brand new one
// (because the original one will never take effect on whatever computation that we are performing)

// With Reference types, or Objects, it's a little bit different...

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.awt.*;

public class Section3_PassByReference {

    public static void main(String[] args) {

        int x = 0;
        int y = incrementValue(x);
        System.out.println(x);
        System.out.println(y);

        // Create point object
        Point point = new Point(100, 100);
        // Invoice changePoint method
        changePoint(point);
        // Print the actual point
        System.out.println(point);
        // This prints: java.awt.Point[x=0,y=0]

        // Now recall that, with primitive values, the actual value does not change
        // However, as we can see here, reference types are a bit different.
        // The original point object had x:100 and y:100
        // Then we invoked the changePoint method (below) by passing the actual point
        // Then we mutated the x and y values to zero
        // And we can see (above) that that did take effect (i.e. java.awt.Point[x=0,y=0])

        // So, this illustrates that reference types (or Objects) are passed by reference
        // While the primitive types are passed by value
        // And the difference is, with reference types, we are actually mutating whatever we pass to our method
        // i.e. we are mutating the original object (e.g. see below, static void changePoint(Point point))
        // Whereas, with primitives, we don't, because it's passed by value, which simply takes a copy of the original one and never touches whatever we pass into our method
        // This is something to bear in mind, then - that if we pass an object, it gets mutated; if we pass a primitive, it doesn't (e.g. see below, static int incrementValue(int value)

    }

    // Let's now create another method...
    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }

    static int incrementValue(int value) {
        return value + 1;
    }

}
