package org.example.level_3;

import org.example.level_3.model.Smartphone;

public class Main {

    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("iPhone", 2008);

        System.out.println(smartphone);
        // Creo que esto lo tengo que cambiar
        System.out.println(smartphone.call(677554662));
        System.out.println(smartphone.takePhoto());

    }

}