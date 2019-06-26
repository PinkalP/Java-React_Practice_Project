package com.pinkal;

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
       // greeter.Greet();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.Greet(helloWorldGreeting);

        Greeting MyLambdaFunction =() -> System.out.println("Hello World!");
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        greeter.Greet(MyLambdaFunction);
        greeter.Greet(innerClassGreeting);

    }
}
