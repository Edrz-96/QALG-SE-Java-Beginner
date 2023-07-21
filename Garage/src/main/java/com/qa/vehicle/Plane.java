package com.qa.vehicle;

public class Plane extends Vehicle {

    private int fuelCapacity;

    public Plane(int fuelCapacity, int engine, int wheels) {
        super(engine, wheels);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, fuel:%d, engine:%d, number of wheels: %d", getId(), getFuelCapacity(), getEngine(), getWheel());
    }

    @Override
    public float setBill() {
        float bill = 0f;

        bill += this.getEngine() * this.getWheel();

        bill += this.fuelCapacity * 3;

        return bill;
    }
}
