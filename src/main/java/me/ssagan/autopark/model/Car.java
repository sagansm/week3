package me.ssagan.autopark.model;

public class Car {
    String model;
    String color;

    public void drive() {
        System.out.println(this.model + " is driving! vrooom-vrooom!");
    }
    public void brake() {
        System.out.println(this.model + " is braking! keep your distance!");
    }

    public Car(){

    }

    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }
}
