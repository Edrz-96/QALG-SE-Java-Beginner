package com.qa.vehicle;

public abstract class Vehicle {

        private static int count = 0;

        private int id;

        private int wheel;

        private int engine;

        public Vehicle() {
            this.id = ++count;
        }

        public Vehicle(int noOfWheels, int engine) {
            this();
            this.wheel = noOfWheels;
            this.engine = engine;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getWheel() {
            return wheel;
        }

        public void setWheel(int wheel) {
            this.wheel = wheel;
        }

        public int getEngine() {
            return engine;
        }

        public void setEngine(int engine) {
            this.engine = engine;
        }

        @Override
        public String toString() {
            return String.format("Id: %d, engine:%d, number of wheels: %d", getId(), getEngine(),getWheel());
        }

        public abstract float setBill();
    }
