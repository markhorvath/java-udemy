package com.company;

public class Main {

    public static void main(String[] args) {
	Meat meat = new Meat("beef");
	Bun bun = new Bun("regular roll");
	Hamburger hamburger = new Hamburger(bun, meat);
	hamburger.makeHamburger();
    }

}
