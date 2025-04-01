package org.example.level_3;

import org.example.level_3.model.Smartphone;

import static org.example.level_3.model.Generic.GenericPhone;
import static org.example.level_3.model.Generic.GenericSmartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("iPhone", 2008);

        System.out.println(smartphone);
        System.out.println(GenericPhone(smartphone, 677554662));
        System.out.println(GenericSmartphone(smartphone, 677554662));
    }

}