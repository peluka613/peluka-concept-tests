package com.test;

import java.util.Arrays;
import java.util.List;

public class StreamSortingExample {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Carlos", "Valencia"),
                new Person("Hector", "Valencia"),
                new Person("Jorge", "Valencia"),
                new Person("Pablo", "Valencia"),
                new Person("Carlos", "Rojas")
        );


        personList.stream().sorted((a, b) -> a.getLastName().compareTo(b.getLastName()))
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(System.out::println);

    }



}

