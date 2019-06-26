package com.pinkal;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest =" + calculation(10000,2));
        System.out.println("10,000 at 3% interest =" + calculation(10000,3));
        System.out.println("10,000 at 4% interest =" + calculation(10000,4));
        System.out.println("10,000 at 5% interest =" + calculation(10000,5));

        for(int i =0; i<5;i++){
            System.out.println("Loop " + i + "Hello!");
        }

        for(int i=2; i<9 ; i++){
            System.out.println("10,000 at" + i +"% interest =" + calculation(10000,i));
        }
        System.out.println("***************************");
        for(int i=8; i>2 ; i--){
            System.out.println("10,000 at" + i +"% interest =" + calculation(10000,i));
        }
    }
    public static double calculation(double amount, double interestrRate){
        return (amount*(interestrRate/100));
    }
}
