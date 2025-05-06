package org.example.level_1.exercici_1;

public class NoGenericMethods {

    private int num1;
    private int num2;
    private int num3;

    public NoGenericMethods(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String toString() {
        return num1 + ", " + num2 + ", " + num3;
    }

}