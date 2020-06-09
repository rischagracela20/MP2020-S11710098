package com.multiplatform;

import com.sun.jdi.LongValue;

public class Main {

    public static void main(String[] args) {
	    byte byteValue = 35;
	    short shortValue = 95;
	    int intValue = 110;
	    long longvalue = byteValue + shortValue + intValue;
	    long totallongValue = 50000 + 10L * longvalue;

        System.out.println("longvalue = " + totallongValue);
    }
}
