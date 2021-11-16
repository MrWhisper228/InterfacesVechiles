package com.company;

import java.util.Arrays;


public class Garage {
    AVehicles[] usMilitaryBase;

    public Garage(AVehicles... usMilitaryBase) {
        this.usMilitaryBase = usMilitaryBase;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "usMilitaryBase=" + Arrays.toString(usMilitaryBase) +
                '}';
    }
}
