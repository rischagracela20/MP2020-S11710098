package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Inheritance: is a relationship
        //Composition: has a relationship
        //PC: Monitor, Motherboard, Case

        //make an object first;
        Case Dzumba = new Case("DZ12342", "Dzumba", "240");
        Motherboard Asus = new Motherboard("AS1232", "Asus", 4, 4, "v.2.0");
        Monitor LG = new Monitor("LG200mx", "LG", 27, new Resolution(2440, 1400));

        PC myDreamPc = new PC(Dzumba, Asus, LG);
        myDreamPc.startPC("Linux Ubuntu");
    }
}