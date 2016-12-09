package com.jrf;

public class Main {

    public static void main(String[] args) {
	    // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotalValue = myMaxValue/2;
        System.out.println("myTotal = " + myTotalValue);

//        has a width of 8
        byte myByteValue = 127;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue  = " + myNewByteValue);
//        has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
//        has a width of 64
        long myLongValue = 100L;
        long myFancyLong = 500000L + (10L * (long) myByteValue) + (long) myShortValue + (long) myTotalValue;

        System.out.println(myFancyLong);

    }
}
