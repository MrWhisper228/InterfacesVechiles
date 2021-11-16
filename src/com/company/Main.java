package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Garage usMilitaryBase = new Garage(
                new Plane(LocalDate.of(1997, 01, 01), "B2", 1010, 2100000000, 10000, 2),
                new Car(LocalDate.of(1980, 01, 01), "M1 ABRAMS", 66.8, 6200000, 54),
                new Ship(LocalDate.of(1913, 01, 01), "USS Montana", 50, 18000000, 2149, "New York"));
        System.out.println(usMilitaryBase);
    }

}
