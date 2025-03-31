package org.example.level_2.exercici_2;

import java.util.List;

public class GenericMethods {

    public <T> void genericMethod(List<T> param1, List<T> param2, List<T> param3) {
        for (Object element : param1) {
            System.out.println(element);
        }
        for (Object element : param2) {
            System.out.println(element);
        }
        for (Object element : param3) {
            System.out.println(element);
        }
    }

}