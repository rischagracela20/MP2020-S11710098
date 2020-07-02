package com.multiplatform;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    Car(){}

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine(){
        System.out.println("Car Engine Started");
    }
    public void accelerate(){
        System.out.println("Car is Accelerated");
    }
    public void brake(){
        System.out.println("Car is Stopped, brakes is applied");
    }
}
