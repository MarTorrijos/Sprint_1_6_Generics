package org.example.level_2.exercici_2;

import java.util.List;

public class GenericMethods {

    public <T1, T2, T3> void genericMethod(List<T1> param1, List<T2> param2, List<T3> param3) {
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