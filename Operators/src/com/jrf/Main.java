package com.jrf;

public class Main {

    public static void main(String[] args) {
        // Fun with operators
       /* int result = 1 + 2;
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
        System.out.println( previousResult );
        System.out.println(result);

        previousResult = result;
        result =  result % 3;
        System.out.println( previousResult );
        System.out.println(result);

        previousResult = result;
        result = result +1 ;
        result++;

        System.out.println("Result is now: " + result);

        result--;
        System.out.println("Result is now: " + result);
        result+=2;
        System.out.println("Result is now: " + result);
        result*=10;
        System.out.println("Result is now: " + result);
        result-=10;
        System.out.println("Result is now: " + result);
        result /= 10;
        System.out.println("Result is now: " + result);*/

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You got the high score");

        int secondTopScore = 60;
        if (topScore > secondTopScore || topScore < 100)
            System.out.println("Greater than second top score and less then 100");


    }
}
