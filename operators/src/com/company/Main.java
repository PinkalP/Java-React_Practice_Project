package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 10 + 35;
        System.out.println("10 + 35 = " + result);

        int previousResult = result ;
        result = result -1 ;
        System.out.println(previousResult + " - 1 =" +  result);

        previousResult = result;
        result = result *10;
        System.out.println(previousResult + " * 10 ="  + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 10 ="  + result);

        previousResult = result;
        result = result %10;
        System.out.println(previousResult + " % 10 ="  + result);

        previousResult = result;
        result = result %10;
        result++;
        System.out.println("result Now is :" + result);

        previousResult = result;
        result = result %10;
        result--;
        System.out.println("result Now is :" + result);

        result +=2;
        System.out.println("result now is : " +result);

        result *=5;
        System.out.println("result now is : " +result);

        result -=2;
        System.out.println("result now is : " +result);

        result %=2;
        System.out.println("result now is : " +result);

        result /=2;
        System.out.println("result now is : " +result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println(" it is not alien!");

        int score =100;
        if (score == 100)
            System.out.println("You win!!");

        int score2 = 80;
        if (score2 < 100)
            System.out.println("You win second price!!");

        int score3 =60;
        if((score2 > score3) && (score2 < 100))
            System.out.println("Grater then top score and less then 100");

        if ((score2 > 90) || (score <= 100))
            System.out.println("One  of this tests is true!!!");

        boolean isCar = false;
        if (isCar = true)
        System.out.println("This is not suppose to happen");

        boolean wasCar = isCar ? true :false;
        if (wasCar)
            System.out.println("wasCar is true");
    }
}
