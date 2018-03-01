package com.company;

public class Hamburger {
    private Bun bun;
    private Meat meat;
    private double price;

    public Hamburger(Bun bun, Meat meat, double price) {
        this.bun = bun;
        this.meat = meat;
        this.price = price;
    }

    public Hamburger(Bun bun, Meat meat) {
        this.bun = bun;
        this.meat = meat;
        this.price = meat.getMeatPrice() + bun.getBunPrice();
    }

    public void makeHamburger() {
        System.out.println("Hamburger with " + bun.getBunType() + " and a " + meat.getMeatType() + " made for a " +
                "total price of $" + price);
    }
}

