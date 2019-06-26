package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKilloBytes(2050);

        BarkingDog.bark(true, 1);
       // BarkingDog.bark(false, 22);
        //TalkingDog talkingDog = new TalkingDog();

       // talkingDog.talk(false, 10);


    }

    public static void printMegaBytesAndKilloBytes(int killoBytes) {
       int Mb = killoBytes/1024;
       int Kb  = killoBytes% 1024;

        if (killoBytes < 0){
            System.out.println("Invalid value");
        }else {
            System.out.println(killoBytes+ " " +"KB="+" "+ Mb+ " MB" +" "+ "And"+" "+Kb +" "+"KB" );
        }
    }
}
