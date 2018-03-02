package com.company;

public class VeggieBurger extends Hamburger {
    private String add5;
    private double add5Price;
    private String add6;
    private double add6Price;

    public VeggieBurger(String meat, double price) {
        super("Veggie", meat, price, "brown rye");
    }

    public void addAddition5(String name, double price) {
        this.add5 = name;
        this.add5Price = price;
    }

    public void addAddition6(String name, double price) {
        this.add6 = name;
        this.add6Price = price;
    }

    @Override
    public double calcHamburgerPrice() {
        double burgerPrice =  super.calcHamburgerPrice();
        if(add5 != null) {
            burgerPrice += add5Price;
            System.out.println("Added " + this.add5 + " for an extra $" + String.format ("%.2f", add5Price));
        }
        if(add6 != null) {
            burgerPrice += add6Price;
            System.out.println("Added " + this.add6 + " for an extra $" + String.format ("%.2f", add6Price));
        }
        return burgerPrice;
    }
}
