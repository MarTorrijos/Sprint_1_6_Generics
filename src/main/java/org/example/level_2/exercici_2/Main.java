package org.example.level_2.exercici_2;

import org.example.level_2.exercici_1.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Person> adults = new ArrayList<>();
    private static List<Person> kids = new ArrayList<>();
    private static List<Person> elderly = new ArrayList<>();

    public static void main(String[] args) {
        adults.add(new Person("Marta", "Hernandez", 54));
        adults.add(new Person("Carlos", "Fernandez", 24));

        kids.add(new Person("Isabel", "Perez", 10));

        elderly.add(new Person("Eustaquia", "Olivares", 99));

        GenericMethods genericM = new GenericMethods();
        genericM.genericMethod(adults, kids, elderly);
    }

}