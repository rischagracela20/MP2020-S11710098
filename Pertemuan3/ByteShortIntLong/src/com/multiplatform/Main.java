package com.multiplatform;

public class Main {

    public static void main(String[] args) {
	        int myValue = 10000;

	        int myMaxIntValue = Integer.MAX_VALUE;
	        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("Integer Maximum INT value = " + myMaxIntValue);
        System.out.println("Integer Minimum INT Value = " + myMinIntValue);
        System.out.println("Overflow max INT Value = " + (myMaxIntValue + 1));
        System.out.println("Underflow min INT Value = " + (myMinIntValue - 1));
    }
}
