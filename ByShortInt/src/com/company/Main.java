package com.company;

public class Main {

    public static void main(String[] args) {
       // int has width of 32
        int minNumber = -2147483648;
        int maxNumber = 2147483647;
        int totalInt = (minNumber/2);

        System.out.println("TotalInt" + totalInt );

        // byte has width of 8
        byte bytevalue = -128;
        byte totalByte = (byte) (bytevalue/2);

        System.out.println("TotalByte" + totalByte );

        //short has a width of 16
        short shortValue = 32767;
        short TotalValue = (short) (shortValue/2);
        System.out.println("TotalValue" + TotalValue );

        //long has a width of 64
        long longValue = 545454545454L;

    }
}
