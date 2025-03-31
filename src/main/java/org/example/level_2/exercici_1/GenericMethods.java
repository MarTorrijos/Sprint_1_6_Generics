package org.example.level_2.exercici_1;

public class GenericMethods {

    public static <T> void genericMethod(T param1, T param2, int number) {
        System.out.println(param1);
        System.out.println(param2);
        System.out.println(number);
    }

}
