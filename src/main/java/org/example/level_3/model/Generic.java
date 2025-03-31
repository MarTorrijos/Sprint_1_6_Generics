package org.example.level_3.model;

import org.example.level_3.model.interfaces.Phone;

public class Generic {

    // Des d’aquests dos mètodes crida els mètodes pertinents de Telefon i Smartphone.
    // Mètode generic que ha de rebre un tipus d’argument limitat per la interfície Telefon
    // I mètode que ha de rebre un argument limitat per la classe Smartphone

    public static <T extends Phone> String GenericPhone(T object, int number) {
        return object.call(number);
    }

    public static <T extends Smartphone> String GenericSmartphone(T smartphone) {
        return smartphone.takePhoto();
    }

}