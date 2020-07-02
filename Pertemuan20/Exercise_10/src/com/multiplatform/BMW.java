package com.multiplatform;

public class BMW extends Car {

    public  BMW(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW crossover is started");
    }

    @Override
    public void accelerate() {
        System.out.println("BMW crossover is Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("BMW crossover is stopped, and brakes applied");
    }
}
