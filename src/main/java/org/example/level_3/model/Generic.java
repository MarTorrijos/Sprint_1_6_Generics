package org.example.level_3.model;

import org.example.level_3.model.interfaces.Phone;

public class Generic {

    public static <T extends Phone> String GenericPhone(T phone, int number) {
        String callResult = phone.call(number);

        if (phone instanceof Smartphone smartphone) {
            callResult = callResult + ". " + smartphone.takePhoto();
        }

        return callResult;
    }

    public static <T extends Smartphone> String GenericSmartphone(T smartphone, int number) {
        return smartphone.takePhoto() + ". " + smartphone.call(number);
    }

}