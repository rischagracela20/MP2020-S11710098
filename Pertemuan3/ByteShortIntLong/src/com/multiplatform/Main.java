package com.multiplatform;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
	        int myValue = 10000;

	        int myMaxIntValue = Integer.MAX_VALUE;
	        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println("INT :");
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Overflow max Value = " + (myMaxIntValue + 1));
        System.out.println("Underflow min Value = " + (myMinIntValue - 1));

        int myMaxByteValue = Byte.MAX_VALUE;
        int myMINByteValue = Byte.MIN_VALUE;
        System.out.println("BYTE :");
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Byte Minumum Value = " + myMINByteValue);
        System.out.println("Overflow max Value = " + (myMaxByteValue + 1));
        System.out.println("Underflow min Value = " + (myMINByteValue - 1));

        int myMaxShortValue = Short.MAX_VALUE;
        int myMinShortValue = Short.MIN_VALUE;
        System.out.println("SHORT :");
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Overflow max Value = " + (myMaxShortValue + 1));
        System.out.println("Underflow min Value = " + (myMinShortValue - 1));

        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("LONG :");
        System.out.println("Integer Maximum Value = " + myMaxLongValue);
        System.out.println("Integer Minimum Value = " + myMinLongValue);
        System.out.println("Overflow max Value = " + (myMaxLongValue + 1));
        System.out.println("Underflow min Value = " + (myMinLongValue - 1));
    }
}
