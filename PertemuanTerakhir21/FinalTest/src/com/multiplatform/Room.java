package com.multiplatform;

public class Room {
    private int table = 2;
    private int bed = 1;
    private int chair = 2;
    private int mirror = 1;

    private int getTable() {
        return table;
    }

    private int getBed() {
        return bed;
    }

    private int getChair() {
        return chair;
    }

    private int getMirror() {
        return mirror;
    }
    public void stuffInMyRoom(){
        System.out.println("Table : " + getTable());
        System.out.println("Bed : " + getBed());
        System.out.println("Chair : " + getChair());
        System.out.println("Mirror : " + getMirror());
    }
}
