// To create a variable, we need to be really explicit about it...

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.awt.*;
import java.time.LocalDate;

public class Section4_VarKeyword {

    public static void main(String[] args) {

//        // When creating variables, we need to specify the actual data type first, then the variable name, then the value
//        String name = "Jamil";
//        Point point = new Point(10, 10);
//        double PI = Math.PI;
//        int age = 10;
//        LocalDate now = LocalDate.now();
//
//        // We can remove the actual data type and let Java infer what the data type is...
//        // e.g. in JS, we can say var name or const name
//        // In Java we can do the same thing

        // So now, instead of defining the actual data type first...
        var name = "Jamil";
        var point = new Point(10, 10);
        var PI = Math.PI;
        var age = 10;
        var now = LocalDate.now();

        // This means that the compiler will infer the data type for us
        // This is a very nice feature that we can take advantage of!


    }

}
