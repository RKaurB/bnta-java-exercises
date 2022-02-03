package com.bnta.exercises.week_3.classes_exercise10;

/*
5. Create a class to represent a car dealership. It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.
- Hint 1: We could create an individual property for each car we have in stock, but is there a data type we have already seen which would let us store all our cars together in the same variable? How can we figure out how big that data structure should be?
- Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we create a dealership, or can we define our class in such a way that every new dealership starts with no cars?
*/

import java.util.Arrays;

public class CarDealership {

    // PROPERTIES

    private String name;
    private int maxCars;
    private Car[] carsInStock;

    // CONSTRUCTOR

    public CarDealership(String name, int maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        this.carsInStock = new Car[maxCars];    // empty array of maxCars length
    }

    // 6. Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int. Write another method to add a car to the dealership.
    // The method should have a Car parameter and doesn't need to return anything. Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
    //Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?
    public int totalCars() {
        int count = 0;
        for (int i = 0; i < maxCars; i++) {
            if (this.carsInStock[i] != null) {
                count++;
            }
        }
        return count;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

}

