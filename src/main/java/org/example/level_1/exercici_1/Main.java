package org.example.level_1.exercici_1;

public class Main {

    public static void main(String[] args) {
        NoGenericMethods noGeneric = new NoGenericMethods(3, 5, 6);

        System.out.println("All numbers: " + noGeneric.getNumbers());

        System.out.println("Getting numbers one by one:");
        System.out.println(noGeneric.getNum1());
        System.out.println(noGeneric.getNum2());
        System.out.println(noGeneric.getNum3());
    }

}