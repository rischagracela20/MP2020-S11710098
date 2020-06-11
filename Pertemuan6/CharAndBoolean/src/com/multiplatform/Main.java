package com.multiplatform;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUniccodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUniccodeChar);
        char myOtherUniccodeChar = '\u00A9';
        System.out.println(myOtherUniccodeChar);

        boolean myFirstBoolean = true;
        boolean mySecondBoolean = false;
        boolean isLoggedIn = true;

        //tipe data yang sudah di pelajari :
        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        //string(akan sering digunakan)


        String myString = "This is a string";
        System.out.println("My String " + myString);
        myString = myString + ", this is more";
        System.out.println("My String : " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("My String : " + myString);

        String myNumberString = "50.25";
        System.out.println("40.75" + myNumberString);
        int myInt = 10;
        myNumberString = myNumberString + myInt;
        System.out.println(myNumberString);


    }
}
