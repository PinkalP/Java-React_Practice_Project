package com.company;

public class Main {

    public static void main(String[] args) {
    isLeapYear(-1600);
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0)&&(year%100 !=0)){
                return true;
            } else if(year % 400 == 0){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
