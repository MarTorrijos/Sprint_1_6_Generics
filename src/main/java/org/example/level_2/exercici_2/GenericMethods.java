package org.example.level_2.exercici_2;

import java.util.List;

public class GenericMethods {

    public GenericMethods() {
    }

    public void print(List<?>... attribute) {
        for (List<?> list : attribute) {
            System.out.println(list);
        }
    }

}