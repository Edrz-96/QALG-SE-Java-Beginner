package com.qa.vehicle;

public class Boat extends Vehicle {

    private int hullSize;

    public Boat(int hullSize, int engine, int wheels) {
        super(engine, wheels);
        this.hullSize = hullSize;
    }

    public int getHullSize() {
        return hullSize;
    }

    public void setHullSize(int hullSize) {
        this.hullSize = hullSize;
    }


    @Override
    public String toString() {
        return String.format("Id: %d, hull:%d, engine:%d, number of wheels: %d", getId(), getHullSize(), getEngine(), getWheel());
    }

    @Override
    public float setBill() {
        float bill = 0f;

        bill += this.getEngine() * this.getWheel();

        bill += this.hullSize * 1.5;

        return bill;
    }
}
