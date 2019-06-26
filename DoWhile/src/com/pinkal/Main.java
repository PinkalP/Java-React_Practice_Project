package com.pinkal;

public class Main {

    public static void main(String[] args) {
	int count =1;
	while (count != 6){
        System.out.println("count value is"+ count);
        count++;
    }

    for (count =1; count<7;count++){
        System.out.println("count value is"+ count);
    }
    count =1;
    while (true){
        if (count==6){
            break;
        }
        System.out.println("count value is"+ count);
        count++;
    }
    count=6;
    do{
        System.out.println("count value was"+ count);
        count++;

        if (count>100){
            break;
        }
    }while (count!=6);

//    int number =4;
//    int endNumber = 20;
//
//    while (number<= endNumber){
//        number++;
//        if(!isEvenNumber((number))){
//            continue;
//        }
//        System.out.println("Even Number" + number);
//    }
        int number =4;
        int endNumber = 20;
        int evenNumberFound = 0;

        while (number <= endNumber){
            number++;
            if(!isEvenNumber((number))){
                continue;
            }
            evenNumberFound++;
            if (evenNumberFound >=5){
                break;
            }
            System.out.println("Even Number " + number);
        }
        System.out.println("Total Even numbers Found " +evenNumberFound);

    }
    public static boolean isEvenNumber(int number){
        if((number%2)== 0){
            return true;
        }else {
            return false;
        }
    }
}
