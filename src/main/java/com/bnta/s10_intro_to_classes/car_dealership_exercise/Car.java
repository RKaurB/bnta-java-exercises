package com.bnta.s10_intro_to_classes.car_dealership_exercise;

import java.util.Objects;

// 1.  Create a class to represent a car. The car should have properties representing the manufacturer, price, and engine type (eg. petrol, electric, etc).
public class Car {

    private Manufacturer manufacturer;
    private double price;
    // 4. Modify the engine type property to use an EngineType enum. You'll need to modify the getter and setter to reflect the different data type.
    private EngineType engineType;

    // CONSTRUCTOR
    public Car(Manufacturer manufacturer, double price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    // GETTERS & SETTERS
    // 2. Write getters for each of these properties. Test them in com.bnta.s1_java_fundamentals_1.Main.
    // 3. Write setters for the properties. Test them in com.bnta.s1_java_fundamentals_1.Main.
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    // TOSTRING()
    @Override
    public String toString() {
        return "Cars{" +
                "manufacturer=" + manufacturer +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }

    // EQUALS() & HASHCODE()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && manufacturer == car.manufacturer && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }
}

