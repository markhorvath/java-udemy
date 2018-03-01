package com.company;

public class Bun {
    private double price;
    private String type;

    public Bun(String type) {
        this.type = type;
        if ("regular roll".equals(type)) {
            this.price = 0.50;
            System.out.println("Regular roll selected for $0.50");

        } else if ("brown rye".equals(type)) {
            this.price = 1.00;
            System.out.println("Brown rye selected for $1.00");

        } else {
            System.out.println("Must choose either 'regular roll' or 'brown rye'");
        }
    }

    public double getBunPrice() {
        return price;
    }

    public String getBunType() {
        return type;
    }
}
