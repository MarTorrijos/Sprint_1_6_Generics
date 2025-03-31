package org.example.level_2.exercici_1;

public class Main {

    public static void main(String[] args) {
        GenericMethods genericM = new GenericMethods();

        genericM.genericMethod(1, "The next parameter has to be a number", 2);
        System.out.println();
        genericM.genericMethod(new Person("Juan", "García", 83).toString(), "Same here", 23);
    }

}