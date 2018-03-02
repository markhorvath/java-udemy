package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "two angus beef patties", 10.99, "white");
        super.addAddition1("Drink", 1.20);
        super.addAddition2("Chips", 1.55);
    }

    @Override
    public void addAddition1(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addAddition2(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addAddition3(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }

    @Override
    public void addAddition4(String name, double price) {
        System.out.println("Cannot add additional items to Deluxe Burger");
    }
}
