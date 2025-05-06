package org.example.level_1.exercici_1;

public class Main {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 5;
        int num3 = 6;

        System.out.println(new NoGenericMethods(num1, num2, num3));
        System.out.println(new NoGenericMethods(num2, num3, num1));
        System.out.println(new NoGenericMethods(num3, num1, num2));

    }

}