package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	printYearsAndDays(525600);
	printYearsAndDays(1051200);
	printYearsAndDays(561600);
    }
    public  static void printYearsAndDays(long minutes){

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days/365;
        long remainderDays = days % 365;

        if (minutes < 0){
            System.out.println("Invalid Value");
        }

            System.out.println(minutes + "min =" + years + " years " + " and " + remainderDays + " days " );

    }
}
