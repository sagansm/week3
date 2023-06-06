package me.ssagan.autopark.model;

public class CarDemonstrator {
    public static void demonstrate() {
        Car skoda = new Car();
        skoda.model = "Skoda fabia";
        skoda.color = "green";

        Car qashqai = new Car("Nissan qashqai", "black");

        System.out.println("Model: " + skoda.model + ". Color: " + skoda.color);
        System.out.println("Model: " + qashqai.model + ". Color: " + qashqai.color);
    }
}