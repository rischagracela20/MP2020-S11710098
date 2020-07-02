package com.multiplatform;

public class Toyota extends Car{

    public Toyota(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Toyota Alphard is started");
    }

    @Override
    public void accelerate() {
        System.out.println("Toyota Aplhard is Accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Toyota Alphard is stopped, and brakes applied");
    }
}
