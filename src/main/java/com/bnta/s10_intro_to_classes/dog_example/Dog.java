package com.bnta.s10_intro_to_classes.dog_example;

public class Dog {

    // Attributes/properties
    // Private ensures these attributes are only accessible within this class
    // Best practice
    private String name;
    private int age;

    // Constructor method
    // Whenever we create a Dog object, we need to give it a name and an age
    public Dog(String name, int age) {
        // Now we need to set these values, so that these attributes equal to whatever we pass in
        // this. keyword is referencing the attributes of the class (see above attributes)
        // i.e. this specific instance is going to have a name of [ ] and an age of [ ]
        this.name = name;
        this.age = age;
        // add2();
        // speak();
    }

    // Create another method...
    public void speak() {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old");
    }

    // Getter method
    // We need this because it's private, so can only see within the Dog class (not in com.bnta.s1_java_fundamentals_1.Main)
    public int getAge() {
        return this.age;
    }

    // Setter method
    // Can do the same thing if we want to change the age later on
    public void setAge(int age) {
        this.age = age;
    }

    // Private method, can only be seen within this Dog class
    private int add2() {
        return this.age + 2;
    }

}
