package me.ssagan.autopark.model;

public class Car {
    private String model;
    private String color;

     public Car(){

    }

    public Car(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setModel(String model){
         this.model = model;
    }

    public String getModel(){
         return this.model;
    }

    public void setColor(String color){
         this.color = color;
    }

    public String getColor(){
         return this.color;
    }

    public void drive() {
         System.out.println(this.model + " is driving! vrooom-vrooom!");
    }
    public void brake() {
         System.out.println(this.model + " is braking! keep your distance!");
    }

}
