package org.example.level_2.exercici_2;

public class GenericMethods {

    public static <T> void genericMethod(T... params) {
        for (T param : params) {
            System.out.print(param + ", ");
        }
    }

}