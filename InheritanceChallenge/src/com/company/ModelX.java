package com.company;

public class ModelX extends Car {
    private int roadServiceMonths;

    public ModelX(int roadServiceMonths) {
        super("Model X", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
