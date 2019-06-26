package com.pinkal;

public class ClosuresExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        doProcess(a, i -> System.out.println(i+b));
    }
    public static void doProcess(int i, Process p){
        p.proccess(i);
    }

}
interface Process{
    void proccess(int i);
}