package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945L));
    }
    private static String getDurationString(long minute, long seconds){
        if ((minute < 0)|| (seconds < 0) || (seconds>59)){
            return"Invalid Value";
        }
        long hours = minute/60;
        long remainingMinute = minute %60;
        return hours + "h " + remainingMinute + " m "+ seconds +"s";
    }

    private static String getDurationString(long seconds){
        if (seconds < 0){
            return "Invalid Value";
        }
        long minute = seconds/60;
        long remainingMinute = seconds%60;
        return getDurationString(minute, remainingMinute);

    }

}
