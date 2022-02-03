package com.bnta.exercises.week_3.classes_exercise10;

public class Main {

    public static void main(String[] args) {

        // 2. Write getters for each of these properties. Test them in Main.
        // 3. Write setters for the properties. Test them in Main.

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
