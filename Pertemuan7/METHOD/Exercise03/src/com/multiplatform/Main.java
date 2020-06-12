package com.multiplatform;

public class Main {

    public static  void main(String[] args) {
        //1.
        toMilesPerHour(10.25);
        System.out.println("Valid Value (number 1) : " + toMilesPerHour(10.25));
        //2.
        printConversion(1.5);
        printConversion(10.25);
    }
    //1.
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            return  -1;
        }
        return  Math.round(kilometersPerHour / 1.609);
    }

    //2.
    public static  void  printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else {
            long milesPerHours = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHours +"mi/h");
        }
    }
}
