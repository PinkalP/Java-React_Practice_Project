package com.pinkal;

public class TypeInferenceExample {

    public static void main(String[] args) {
        printlambada(s -> s.length());
        // StringLengthLambda myLambda = s ->s.length();
        //  System.out.println(myLambda.getLength("hello lambda"));
    }

    public static void printlambada(StringLengthLambda l) {
        System.out.println(l.getLength("HELLO LAMBDA"));
    }

    interface  StringLengthLambda{
        int getLength(String s);
    }
}
