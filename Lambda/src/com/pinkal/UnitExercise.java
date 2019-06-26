package com.pinkal;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExercise {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pinkal", "Patel", 29),
                new Person("rimmi", "shah", 32),
                new Person("Guru", "Patel", 29),
                new Person("Pritesh", "Patel", 32),
                new Person("Moni", "Patel", 25)
        );

        //step: 1  sort list by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastname().compareTo(o2.getLastname());
            }
        });

        //step :2 create a method that prints all element in the list
        System.out.println("printing all persons");
        //printAll(people);

        //step: 3 create a method that prints all people that have last name begining with p

        printLastConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastname().startsWith("M");
            }
        });
    }

    private static void printLastConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

//    private static void printAll(List <Person> people){
//        for (Person p: people){
//            System.out.println(p);
//        }
//    }
    }

    interface Condition {
        boolean test(Person p);
    }
}
