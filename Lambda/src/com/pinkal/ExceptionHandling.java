package com.pinkal;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] somenumber ={1,2,3,4,};
        int key = 0;

        process(somenumber,key,wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] somenumber, int key , BiConsumer<Integer, Integer> consumer) {
        for (int i: somenumber){
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda( BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
            //System.out.println("Executing from wrapper");
            try{
                consumer.accept(v, k);
            }
            catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lambda");
            }

        };
    }
}
