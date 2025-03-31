package org.example.level_2.exercici_2;

import org.example.level_2.exercici_1.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Person> persons = new ArrayList<>();
    private static List<String> objects = new ArrayList<>();
    private static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        persons.add(new Person("Marta", "Hernandez", 54));
        persons.add(new Person("Carlos", "Fernandez", 24));

        objects.add("Carpet");
        objects.add("Ball");

        numbers.add(99);
        numbers.add(1);

        GenericMethods genericM = new GenericMethods();
        genericM.genericMethod(persons, objects, numbers);
    }

}