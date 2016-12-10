package com.jrf;

public class Main {

    public static void main(String[] args) {
	// string
        String myString = "This is a string";
        System.out.println(myString);

        myString += ", and this is more.";
        System.out.println(myString);

        myString += " \u00A9 2016";
        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString  + "49.55";
        System.out.println(numberString);

        String lastString =  "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);


    }
}
