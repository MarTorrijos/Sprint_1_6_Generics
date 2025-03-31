package org.example.level_2.exercici_2;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person called " + name + " " + surname + ", " + age + " years";
    }

}