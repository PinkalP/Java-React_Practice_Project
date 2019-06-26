package com.pinkal;

import java.time.temporal.WeekFields;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
        printDayOfTheWeek(-1);

        printDayOfTheWeek2(0);
        printDayOfTheWeek2(1);
        printDayOfTheWeek2(2);
        printDayOfTheWeek2(3);
        printDayOfTheWeek2(4);
        printDayOfTheWeek2(5);
        printDayOfTheWeek2(6);
        printDayOfTheWeek2(7);
        printDayOfTheWeek2(-1);


        int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }
        int switchvalue = 1;
        switch (switchvalue = 3) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("value 3,or value 4, or value 5");
                System.out.println("Actually it was a " + switchvalue);

            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char latter = 'D';
        switch (latter = 'D') {
            case 'A':
                System.out.println("Char value A");
                break;
            case 'B':
                System.out.println("char value B");
                break;
            case 'C':
                System.out.println("char value C");
                break;
            case 'D':
            case 'E':
                System.out.println("char value D or E");
                break;
            default:
                System.out.println("was not Found");
                break;
        }


    }

    private static void printDayOfTheWeek(int day) {
        String weekdays = "Monday";
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }

    private static void printDayOfTheWeek2(int day){
        if(day==0){
            System.out.println("Sunday");
        }else if(day==1){
            System.out.println("Monday");
        }else if(day==2){
            System.out.println("Tuesday");
        }else if(day==3){
            System.out.println("Wednesday");
        }else if(day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }else if(day==6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Day");
        }
    }
}
