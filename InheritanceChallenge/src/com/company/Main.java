package com.company;

public class Main {

    public static void main(String[] args) {
        ModelX modelx = new ModelX(24);
        modelx.accelerate(30);
        modelx.steer(20);
        modelx.accelerate(35);
        modelx.accelerate(-55);
    }
}
