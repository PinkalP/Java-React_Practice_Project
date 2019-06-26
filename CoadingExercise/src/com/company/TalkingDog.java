package com.company;

public class TalkingDog {

    public boolean talk(boolean barking, int hourOfDay) {
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
