package com.company;

import java.time.LocalDate;

public class Ship extends AVehicles {
    private int maxPassengers;
    private String homePort;

    public Ship(LocalDate producedIn, String name, double speed, int price, int maxPassengers, String homePort) {
        super(producedIn, name, speed, price);
        setMaxPassengers(maxPassengers);
        setHomePort(homePort);
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers > 0 ? maxPassengers : -1;
    }

    public String getHomePort() {
        return homePort;
    }

    public void setHomePort(String homePort) {
        this.homePort = homePort.strip();
    }

    @Override
    public void Move() {
        System.out.println("Moves by water");
    }

    @Override
    public String toString() {
        return super.toString() + "homePort= " + homePort + "maxPassengers= " + maxPassengers;
    }
}
