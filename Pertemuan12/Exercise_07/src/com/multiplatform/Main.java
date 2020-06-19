package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();
	person.setFirst_Name(""); //firstName is set to empty string
    person.setLast_Name(""); //lastName is set to empty string
    person.setAge(10);
        System.out.println("FullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    person.setFirst_Name("John"); //set to John
    person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    person.setLast_Name("Smith");
        System.out.println("fullName = " + person.getFullName());

    }
}
