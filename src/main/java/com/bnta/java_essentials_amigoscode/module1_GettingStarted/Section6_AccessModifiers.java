package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

// Access modifiers - this first line here, for a method, a class, or a variable
// i.e. public is the access modifier here
// It means who can actually call this class...
public class Section6_AccessModifiers {
    // ... or this method
    // (Note: we can create this main method by typing main and pressing enter, or by typing psvm and then enter)
    public static void main(String[] args) {
        Lens lens = new Lens();
    }

    // The first access modifier is not to have any access modifier
    // i.e. here, we are simply saying static
    // What this means is that this class here is package protected
    // So, this class (Lens) is package protected, i.e. it's not public, and cannot be accessed from outside the package
    // (e.g. see AccessModifiers_examplePkg --> com.bnta.s1_java_fundamentals_1.Main class)
    // static class Lens {}

    // If we then change this to public, now AccessModifers_examplePkg --> com.bnta.s1_java_fundamentals_1.Main should work
    // Public means is accessible by everything - so it's not package protected
    // And anything can access the actual Lens and create instances of it
    // public static class Lens {}

    // The private access modifier means that Lens is only accessible within this class (see above)
    private static class Lens {}

    // Finally, there is another access modifier - protected - which we will learn about later (alongside inheritance)

    // Note that these access modifiers don't just work with classes
    // They also work with variables
    // e.g.
    public static double PI = Math.PI;

}
