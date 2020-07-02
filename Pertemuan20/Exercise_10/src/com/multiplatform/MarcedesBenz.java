package com.multiplatform;

public class MarcedesBenz extends  Car{

    public MarcedesBenz(String name, int cylinders){
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("MarcedesBenz CLA is started");
    }

    @Override
    public void accelerate() {
        System.out.println("MarcedesBenz CLA is Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("MarcedezBenz CLA is stopped, and brakes applied");
    }
}
