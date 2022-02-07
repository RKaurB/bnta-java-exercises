package com.bnta.exercises.week_3.classes_objects_practice.dog;

public class Main {

    public static void main(String[] args) {
        // Create an instance of the Dog class
        // The instance was named tim, and it referenced the Dog object
        Dog tim = new Dog("tim", 4);
        // Invoke the speak method
        tim.speak();

        Dog bill = new Dog("bill", 7);
        bill.speak();

        Dog bob = new Dog("bob", 11);
        bob.speak();

        int x = tim.getAge();
        System.out.println(x);

        tim.setAge(10);
        tim.speak();

        // Can't use because it's a private method
        // tim.add2();
    }

}
