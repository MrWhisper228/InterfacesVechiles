package com.company;

import java.time.LocalDate;

public class Plane extends AVehicles {
    private int maxHeight;
    private int maxPassengers;
    public Plane(LocalDate producedIn, String name, double speed, int price, int maxHeight, int maxPassengers) {
        super(producedIn, name, speed, price);
        setMaxHeight(maxHeight);
        setMaxPassengers(maxPassengers);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers > 0 ? maxPassengers : -1;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight > 0 ? maxHeight : -1;
    }

    @Override
    public void Move() {
        System.out.println("Moves in the sky");
    }

    @Override
    public String toString() {
        return super.toString() + "maxHeight= " + maxHeight + "maxPassengers" + maxPassengers;
    }
}
