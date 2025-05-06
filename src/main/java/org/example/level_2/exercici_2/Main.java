package org.example.level_2.exercici_2;

import static org.example.level_2.exercici_2.GenericMethods.genericMethod;

public class Main {

    public static void main(String[] args) {

        genericMethod(1, 2, "tres", 4, new Person("Paco", "Paquez", 39));
        System.out.println("---------------------------------------");
        genericMethod(99.9, 1, "Bon dia");

    }

}