package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Pinkal",100);
        System.out.println("New Score is" + newScore);
        calculateScore(10);
        calculateScore();
        double centimeters = calcFeetAndInchesCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid Parameter");
        }
        calcFeetAndInchesCentimeters(100);
    }
    public static int calculateScore(String playerName, int Score){
        System.out.println("Player " + playerName + " Scored " + Score);
        return Score*1000;
    }
    public static int calculateScore( int Score){
        System.out.println("Unnamed Player score " + Score);
        return Score*1000;
    }
    public static int calculateScore( ){
        System.out.println("No Player Name, No player Score" );
        return 0;
    }

    public static double calcFeetAndInchesCentimeters(double feet, double inches){
        if((feet < 0 )||(inches <0) || (inches > 12))
        {
            System.out.println("Invalid Feet or Inches Parameters");
            return -1;
        }
        double centimeters = (feet *12)*2.54;
        centimeters += inches*4;
        System.out.println(feet + " Feet " + inches +" Inches = " + centimeters + " centimeters");
        return centimeters;
    }
    public static double calcFeetAndInchesCentimeters( double inches){
        if(inches<0 )        {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches% 12;
        System.out.println(inches +" inches Equals to" + feet + "Feet and" + remainingInches + "Inches");
        return calcFeetAndInchesCentimeters(feet, remainingInches);
    }
}
