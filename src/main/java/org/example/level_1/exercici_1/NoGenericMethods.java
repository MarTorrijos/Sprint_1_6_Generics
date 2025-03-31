package org.example.level_1.exercici_1;

import java.util.ArrayList;
import java.util.List;

public class NoGenericMethods {

    private List<Integer> numbers;

    public NoGenericMethods(int num1, int num2, int num3) {
        numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int getNum1() {
        return numbers.get(0);
    }

    public int getNum2() {
        return numbers.get(1);
    }

    public int getNum3() {
        return numbers.get(2);
    }

    public void setNum1(int num1) {
        numbers.set(0, num1);
    }

    public void setNum2(int num2) {
        numbers.set(1, num2);
    }

    public void setNum3(int num3) {
        numbers.set(2, num3);
    }

}