package com.bnta.java_essentials_amigoscode.module2_ClassesAndObjects;

// INTRO TO CLASSES:

// A Class is a blueprint/template for creating anything we can think of in the real world, or in terms of software

// E.g. a lens
// We define a blueprint/template of hwo to create lenses, and then from that blueprint/template, we can create multiple lenses (with different attributes
// The lenses are the actual objects themselves
// And what creates these objects (the lens) is the actual class or blueprint

// Classes have two things - attributes (that define the objects you want to create, e.g. colour, brand)
// and behaviours (i.e. what the object can do, e.g. a lens can focus, take pictures, zoom)

// Another example is a phone
// We could have a class that defines the template for creating mobile phones
// and then we could create a bunch of objects (i.e. phones) - instantiated from that blueprint

// So, think of a class as a factory, which can produce a bunch of identical or variations of objects


// 1.  CREATE IPHONE CLASS (see Iphone class)
// This is the template for creating many iphones!


// CLASSES CLASS
public class Classes {

    // Contains our main method
    public static void main(String[] args) {

        // 4.  CREATE OBJECTS
        // (i.e. here, we are creating two phones)

        // Iphone is the template (see the Iphone class), and IphoneX is the object
        // We can re-use the exact same template (Iphone) if we want to create another phone.
        // We refer to these objects as instances - so here we have two instances of iphone
        // Creating a new instance
        // Iphone iphoneX = new Iphone();
        // Here, we are passing the initial values that we want, instead of using the Setter methods for setting the actual values
        // Iphone iphoneX = new Iphone("X", 300.00, false);
        // Iphone iphoneX = new Iphone("XR");
        // Iphone iphoneX = new Iphone("XR", 150.00);
        Iphone iphoneX = new Iphone(
                IphoneModel.IPHONE_X,
                150.00);
        // Create another class (another instance)
        // Iphone iphoneXR = new Iphone();
        Iphone iphoneXR = new Iphone(
                IphoneModel.IPHONE_XR,
                200.00);

        // If we want to get the model as the actual String representation (9)
        System.out.println(iphoneX.getModel());
        System.out.println(iphoneX.getModel().getModelStr());

        // 6.  SET THE ATTRIBUTES USING THE SETTERS
        // This is how we create an Object based off the Class
        // iphoneX.setModel("X");
        // iphoneX.setPrice(300.00);
        // iphoneX.setPrice(100.00);       // initially was 300, but now we've changed it with our Setter method to 100
        // iphoneX.setWaterResistant(false);

        // iphoneXR.setModel("XR");
        // iphoneXR.setPrice(400.00);
        // iphoneXR.setWaterResistant(true);

        // 5.  INVOKE THE BEHAVIOURS/METHODS OF OUR IPHONE, AND PRINT OUT
        // Now, let's try and use the behaviours that we've defined inside of our iphone...
        // (until set, as above, default values printed will be null, 0.0, false)
        // Now we have the toString (8), we no longer need these print statements...
        // System.out.println(iphoneX.getModel());
        // System.out.println(iphoneX.getPrice());
        // System.out.println(iphoneX.isWaterResistant());

        // Print the String representation of the Object
        System.out.println(iphoneX);

        // 9.  ENUMS
        // Enum is a class that allows us to represent a group of constants
        // E.g. we have a bunch of constants that we can determine from the iphone model (e.g. X, XR, etc)
        // So, instead of having the model as a String, we can create a new Class and select Enum type --> IphoneModels - where we can then simply define the actual models

        // 8.  TOSTRING (toString)
        // toString allows us to have the String representation of the Object
        // System.out.println(iphoneX);
        // Prints: com.amigoscode.java_essentials.classes.Iphone@36baf30c

        // System.out.println();

        // System.out.println(iphoneXR.getModel());
        // System.out.println(iphoneXR.getPrice());
        // System.out.println(iphoneXR.isWaterResistant());
    }
}
