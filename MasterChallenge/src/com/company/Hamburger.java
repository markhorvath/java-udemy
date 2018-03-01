package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String bread;

    private String add1;
    private double add1Price;
    private String add2;
    private double add2Price;
    private String add3;
    private double add3Price;
    private String add4;
    private double add4Price;

    public Hamburger(String name, String meat, double price, String bread) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.bread = bread;
    }

    public void addAddition1(String name, double price) {
        this.add1 = name;
        this.add1Price = price;
    }

    public void addAddition1(String name, double price) {
        this.add2 = name;
        this.add2Price = price;
    }

    public void addAddition1(String name, double price) {
        this.add3 = name;
        this.add3Price = price;
    }

    public void addAddition1(String name, double price) {
        this.add4 = name;
        this.add4Price = price;
    }

    public double caclHamburgerPrice() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger " + this.bread + " roll price is $" + this.price);
        if(this.add1 != null) {
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1 + " for an extra $" + this.add1Price);
        }
        if(this.add2 != null) {
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2 + " for an extra $" + this.add2Price);
        }
        if(this.add3 != null) {
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3 + " for an extra $" + this.add3Price);
        }
        if(this.add4 != null) {
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4 + " for an extra $" + this.add4Price);
        }
    }
}
