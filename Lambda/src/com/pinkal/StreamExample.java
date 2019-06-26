package com.pinkal;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Pinkal", "Patel", 29),
                new Person("rimmi", "shah", 32),
                new Person("Guru", "Patel", 29),
                new Person("Pritesh", "Patel", 32),
                new Person("Moni", "Patel", 25)
        );

        people.stream()
                .filter(person -> person.getLastname().startsWith("P"))
                .forEach(person -> System.out.println(person.getFirstname()));

        long count = people.stream()
                .filter(person -> person.getLastname().startsWith("s"))
                .count();

        System.out.println(count);
    }
}
