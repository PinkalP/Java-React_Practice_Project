package com.pinkal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitoneexerciseSolutionjava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pinkal", "Patel", 29),
                new Person("rimmi", "shah", 32),
                new Person("Guru", "Patel", 29),
                new Person("Pritesh", "Patel", 32),
                new Person("Moni", "Patel", 25)
        );

        //step: 1  sort list by last name
        Collections.sort(people, ( p1,  p2) -> p1.getLastname().compareTo(p2.getLastname()));

        //step :2 create a method that prints all element in the list
        System.out.println("printing all persons");
        printLastConditionally(people, p -> true);

        //step: 3 create a method that prints all people that have last name begining with p
        printLastConditionally(people, p -> p.getLastname().startsWith("p"));

        System.out.println("Printing All person name with first name begining with P");

        printLastConditionally(people, p -> p.getFirstname().startsWith("p"));
    }

    private static void printLastConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if (condition.test(p)) {
                System.out.println(p);
            }
        }

    }
    interface Condition {
        boolean test(Person p);
    }
}
