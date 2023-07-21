package com.qa.calc;

public class Calculator {
    int num;

    public Calculator() {
        System.out.println("Created");
    }

    public Calculator(int num) {
        System.out.println("Created");
        this.num = num;
    }

    public float add(float x, float y) {
        return x + y;

    }

    public float sub(float x, float y) {
        return x - y;

    }

    public float div(float x, float y) {
        return x / y;

    }

    public float mul(float x, float y) {
        return x * y;

    }

}

