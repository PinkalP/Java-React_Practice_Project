package com.company;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking == true) {
            if (hourOfDay < 0 || hourOfDay > 23)
                return false;
             else if (hourOfDay < 8 || hourOfDay > 22)
                return true;
             else
                return false;
            }
            else {
                return false;
        }
    }
}

