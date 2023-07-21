package com.qa.vehicle;

public class Car extends Vehicle {

    int mileage;

    public Car(int mileage, int engine, int wheels) {
        super(engine, wheels);
        this.mileage = mileage;
    }


    public int getMileage() {

        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return String.format("Id: %d, mileage:%d, engine:%d, number of wheels: %d", getId(), getMileage(), getEngine(), getWheel());
    }

    @Override
    public float setBill() {
        float bill = 0f;

        bill += this.getEngine() * this.getWheel();

        bill += this.mileage / 0.4;

        return bill;
    }

}
