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

        int secondTopScore = 95;
        if ((topScore > secondTopScore) || (topScore < 100))
            System.out.println("Greater than second top score and less then 100");

        if ((topScore > 110) || (secondTopScore <= 90))
            System.out.println("One of these tests is true.");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = true;
        if (isCar)
            System.out.println("you just assigned it to true");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

//      create a double variable with the value of 20
        double firstDouble = 20;
        double secondDouble = 80;
        double thirdDouble = (firstDouble + secondDouble) * 25;
        double fourthDouble = thirdDouble%40;

        if (fourthDouble <= 20)
            System.out.println("Total was over the limit");

        System.out.println(fourthDouble);

    }
}
