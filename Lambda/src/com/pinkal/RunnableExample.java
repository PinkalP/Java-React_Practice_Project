package com.pinkal;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThred = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Print Inside Runnable");
            }
        });

        myThred.run();

        Thread myLambdaThread = new Thread(() -> System.out.println("Print Inside Runnable"));
        myLambdaThread.run();
    }
}
