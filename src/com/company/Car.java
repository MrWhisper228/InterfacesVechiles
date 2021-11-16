package com.company;

import java.time.LocalDate;

public class Car extends AVehicles {
    private int maxLift;

    public Car(LocalDate producedIn, String name, double speed, int price, int maxLift) {
        super(producedIn, name, speed, price);
        setMaxLift(maxLift);
    }

    public int getMaxLift() {
        return maxLift;
    }

    public void setMaxLift(int maxLift) {
        this.maxLift = maxLift > 0 ? maxLift : -1;
    }

    @Override
    public void Move() {
        System.out.println("Moves on ground");
    }

    @Override
    public String toString() {
        return super.toString() + "maxLift= " + maxLift;
    }
}
