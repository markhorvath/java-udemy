package com.company;

public class Meat {
    private double price;
    private String type;

    public Meat(String type) {
        this.type = type;
        if ("beef".equals(type)) {
            this.price = 2.00;
            System.out.println("Beef patty selected for $2.00");

        } else if ("veggie".equals(type)) {
            this.price = 2.50;
            System.out.println("Veggie patty selected for $2.50");

        } else {
            System.out.println("Must choose either beef or veggie");
        }
    }

    public double getMeatPrice() {
        return price;
    }

    public String getMeatType() {
        return type;
    }
}
