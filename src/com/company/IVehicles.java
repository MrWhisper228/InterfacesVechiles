package com.company;

import java.time.LocalDate;

public interface IVehicles {

    String getName();

    void setName(String name);

    LocalDate getProducedIn();

    void setProducedIn(LocalDate date);

    int getPrice();

    void setPrice(int price);

    double getSpeed();

    void setSpeed(double speed);

    void Move();
}
