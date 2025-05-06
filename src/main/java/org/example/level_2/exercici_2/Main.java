package org.example.level_2.exercici_2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<?> list1 = Arrays.asList(1, 2, "tres", 4, new Person("Paco", "Paquez", 39));
        List<?> list2 = Arrays.asList(99.9, 1, "Bon dia");

        System.out.println("LISTA 1: " + System.lineSeparator() + list1);
        System.out.println("------------------------------------------------------");
        System.out.println("LISTA 2: " + System.lineSeparator() + list2);
    }

}