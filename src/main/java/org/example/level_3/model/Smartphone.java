package org.example.level_3.model;

import org.example.level_3.model.interfaces.Phone;

public class Smartphone implements Phone {

    private String brand;
    private int year;

    public Smartphone(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String takePhoto() {
        return "Photo taken with " + brand;
    }

    @Override
    public String call(int number) {
        return brand + " calling number " + number;
    }

    @Override
    public String toString() {
        return "Smartphone of the brand " + brand + " from the year " + year;
    }

}