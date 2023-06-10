package me.ssagan.autopark.service;

import me.ssagan.autopark.model.Car;

public class CarService {
    public static void demonstrate() {
        Car skoda = new Car();
        skoda.setModel("Skoda fabia");
        skoda.setColor("green");
        Car qashqai = new Car("Nissan qashqai", "black");
        Car taxi = new Car("Ford focus", "yellow");
        System.out.println("Model: " + skoda.getModel() + ". Color: " + skoda.getColor());
        System.out.println("Model: " + qashqai.getModel() + ". Color: " + qashqai.getColor());
        System.out.println("Model: " + taxi.getModel() + ". Color: " + taxi.getColor());
        skoda.drive();
        qashqai.brake();
        taxi.drive();
        taxi.brake();
    }
}