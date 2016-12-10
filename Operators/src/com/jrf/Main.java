package com.jrf;

public class Main {

    public static void main(String[] args) {
        // Fun with operators
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;
        result = result -1;
        System.out.println( previousResult );
        System.out.println(result);

        previousResult =  result;
        result = result * 10;
        System.out.println( previousResult );
        System.out.println(result);

        previousResult =  result;
        result = result / 5;
    }
}
