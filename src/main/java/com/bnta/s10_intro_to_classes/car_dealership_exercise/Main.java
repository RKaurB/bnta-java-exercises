package com.bnta.s10_intro_to_classes.car_dealership_exercise;

public class Main {

    public static void main(String[] args) {

        // 2. Write getters for each of these properties. Test them in com.bnta.s1_java_fundamentals_1.Main.
        // 3. Write setters for the properties. Test them in com.bnta.s1_java_fundamentals_1.Main.

        Car car1 = new Car(Manufacturer.FORD,
                2000.00,
                EngineType.PETROL);

        Car car2 = new Car(Manufacturer.HONDA,
                1500.00,
                EngineType.ELECTRIC);

        Car car3 = new Car(Manufacturer.MERCEDES,
                3000.00,
                EngineType.HYBRID);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

    }

}
