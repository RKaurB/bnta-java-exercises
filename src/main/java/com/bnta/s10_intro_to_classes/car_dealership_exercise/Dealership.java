package com.bnta.s10_intro_to_classes.car_dealership_exercise;

/*
5. Create a class to represent a car dealership. It should have properties representing its name, the maximum number of cars it can have on display and all the cars currently in stock.
- Hint 1: We could create an individual property for each car we have in stock, but is there a data type we have already seen which would let us store all our cars together in the same variable? How can we figure out how big that data structure should be?
- Hint 2: A brand new dealership won't have any cars yet. Do we need to pass that information in the constructor when we create a dealership, or can we define our class in such a way that every new dealership starts with no cars?
*/

import java.util.Arrays;
import java.util.Objects;

public class Dealership {

    // PROPERTIES
    private String name;
    private int maxCars;        // the maximum number of cars it can have on display
    private Car[] carsInStock;  // array to contain all the cars currently in stock

    // CONSTRUCTOR
    public Dealership(String name, int maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        this.carsInStock = new Car[maxCars];    // empty array of maxCars length
    }

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(int maxCars) {
        this.maxCars = maxCars;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    // TOSTRING()
    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }

    // EQUALS() & HASHCODE()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealership that = (Dealership) o;
        return maxCars == that.maxCars && Objects.equals(name, that.name) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCars);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }


    // 6a.
    // - Write a method to count the number of cars in the dealership. It doesn't need to take any parameters and should return an int.
    public int countNumberOfCars() {
        // Initialise counter variable
        int count = 0;
        // Loop through cars array
        for (int i = 0; i < this.maxCars; i++) {
            // If not an empty slot
            if (this.carsInStock[i] != null) {
                // Add 1 car to the counter variable
                count++;
            }
        }
        return count;
    }

    // 6b.
    // - Write another method to add a car to the dealership. The method should have a Car parameter and doesn't need to return anything.
    // Test your method by counting the number of cars, adding a new car then counting again to make sure the number has gone up by one.
    //Hint: You will need some way of finding the first empty slot in the array to save the Car in. Maybe checking each slot in the array in turn would help?



}

