package com.company;

import java.time.LocalDate;
import java.time.Period;

public abstract class AVehicles implements IVehicles {
    LocalDate producedIn;
    private String name;
    private double speed;
    private int price;

    public AVehicles(LocalDate producedIn, String name, double speed, int price) {
        setName(name);
        setProducedIn(producedIn);
        setSpeed(speed);
        setPrice(price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name.strip();
    }

    @Override
    public LocalDate getProducedIn() {
        return producedIn;
    }

    @Override
    public void setProducedIn(LocalDate date) {
        producedIn = Period.between(LocalDate.now(),date).isNegative() ? date : LocalDate.now();
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price > 0 ? price : -1;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed > 0 ? speed : -1;
    }

    @Override
    public String toString() {
        return "AVehicles{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", producedIn=" + producedIn +
                ", price=" + price +
                '}';
    }
}

