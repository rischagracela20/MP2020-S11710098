package com.multiplatform;

public class Fish  extends  Animal{
    private  int eyes;
    private  int fins;

    public Fish(String name, int height, int eyes, int fins) {
        super(name, 1, 1, height);
        this.eyes = eyes;
        this.fins = fins;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is resting");
    }
    private void swim(int speed){
        System.out.println(getName() + " is swimming and speed" + speed);
    }

    @Override
    public void move(int speed) {
        System.out.println(getName()+ " is moving" + speed);
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
