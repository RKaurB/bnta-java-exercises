// How to handle Null Pointers properly...

package com.bnta.java_essentials_amigoscode.module7_NullAndOptionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class NullValues {

    public static void main(String[] args) {

//        // Create a variable brand
//        var brand = "amigoscode";
//        // Prints out brand in uppercase
//        System.out.println(brand.toUpperCase());

        // If we now assign brand = null...
        // (Note: we can't have a null value bound to a var keyword)
        // Null simply means that a variable hasn't been set a value - there is nothing in here
        // Integer number = null;
        // String brand = null;
        // This time, it will fail --> NullPointerException
        // This is a common error, means that whatever (method) we're trying to access doesn't exist/hasn't got a value
        // System.out.println(number.hashCode());
        // System.out.println(brand.toUpperCase());

        // There are ways we can handle this error...
        // We can use try catch exceptions, or we can use Optionals, for dealing with null values
        // If we want to keep going even when this exception is thrown, there are two ways we can deal with this using Exceptions
        // and the third way is using Optionals

        // String brand = "amigoscode";
        String brand = null;

//        // 1.  One way to check for null values is...
//        if (brand != null) {
//            System.out.println(brand.toUpperCase());
//        } else {
//            System.out.println("Brand is null");
//        }

        // 2.  Another way - using try catch
        try {
            System.out.println(brand.toUpperCase());
        } catch (NullPointerException e) {
            System.out.println("Brand is null");
        }
        // Note: The try catch is somewhat expensive, because of the internals of the JVM (to do with the stack)
        // Try not to use this try catch to handle null values - try avoid using this!

        // 3.  A better way of handling nulls - Options
        // This is the preferred way!
        // Simple but powerful

        // Means that the Optional is empty
        // Optional.empty();
        // When we know the actual value, so for sure we can guaranteed that the value will never be null
        // Optional.of();
        // If we're not sure if it's going to be null, we can use .ofNullable()
        // Optional.ofNullable()

        // Optional.of(brand);
        // Here then, we have an error, and the error is NullPointerException

        // If we instead use this...
        Optional.ofNullable(brand);
        // ... we will have no errors

        // Now we can also chain things...
//        String theBrand = Optional.ofNullable(brand)
//                .orElse("Brand is null");       // this is the default value in case our variable is null

//        String theBrand = Optional.ofNullable(brand)
//                .orElseGet(() -> {
//                    // logic
//                    return "Samsung";
//                        });

        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // logic
                    return "Samsung";
                });

        System.out.println(theBrand);

        // This is more elegant code, and falls into the pattern of functional programming

    }
}
