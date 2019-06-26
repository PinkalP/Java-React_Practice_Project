package com.pinkal;

public class Dog extends Animal {

    private  int eyes;
    private int legs;
    private int trail;
    private int coat;

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int trail, int coat) {
        super(name, 1, 1, size, weight);
        this.eyes= eyes;
        this.legs = legs;
        this.trail = trail;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.Chew() called");
    }

    public void eat(){
        System.out.println("Dog.eat called");
        chew();
        super.eat();
    }
}
