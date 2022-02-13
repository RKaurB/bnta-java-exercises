package com.bnta.s10_intro_to_classes.lens_example;

public class Main {

    public static void main(String[] args) {

        // Classes and Objects

        //**************************************************//
        // 2. To create a lens based on the below template  //
        //**************************************************//

        // This is the actual object - the real thing we are modeling/representing based on the template below
        // i.e. the actual lens (lensOne)
        // In the Constructor below, we said that we accept the brand, the focalLength, and isPrime
        Lens lensOne = new Lens("sony", "85mm", true);
        // The template allows us to create as many lenses as we want!
        Lens lensTwo = new Lens("sony", "30mm", true);
        Lens lensThree = new Lens("canon", "24-70mm", false);

        //***************************************************//
        // 3. To print the attributes for each lens (object) //
        //***************************************************//

        System.out.println("Lens 1:");
        System.out.println(lensOne.brand);
        System.out.println(lensOne.focalLength);
        System.out.println(lensOne.isPrime);

        System.out.println("Lens 2:");
        System.out.println(lensTwo.brand);
        System.out.println(lensTwo.focalLength);
        System.out.println(lensTwo.isPrime);

        System.out.println("Lens 3:");
        System.out.println(lensThree.brand);
        System.out.println(lensThree.focalLength);
        System.out.println(lensThree.isPrime);

        }

    //**************************************************//
    // 1. This is our template for creating the lenses  //
    //**************************************************//

    // Note we are using the static keyword because we want to use this class inside of this public static void main method
    // There are better ways such as creating a file with this class in it!
    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        // CONSTRUCTOR
        // We need a way for us to create objects, by passing some properties
        // This is how we construct these objects
        Lens(String brand, String focalLength, boolean isPrime) {
            // this. is referring to the current instance of the current class
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }
    }
}
