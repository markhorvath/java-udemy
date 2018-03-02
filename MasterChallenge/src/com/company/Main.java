package com.company;

public class Main {

    public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Classic", "beef", 4.50, "white");
		hamburger.addAddition1("lettuce", .10);
		hamburger.addAddition2("tomato", .15);
		hamburger.addAddition3("cheese", 1.10);

		double price = hamburger.calcHamburgerPrice();
		System.out.println("Total hamburger price is $" + String.format ("%.2f", price));

		VeggieBurger veggie = new VeggieBurger("veggie patty", 6.50);
		veggie.addAddition1("lettuce", .10);
		veggie.addAddition2("tomato", .15);
		veggie.addAddition3("cheese", 1.10);
		veggie.addAddition4("onion", .20);
		veggie.addAddition5("avacodo", 1.15);
		veggie.addAddition6("portabella mushrooms", .75);

		double veggiePrice = veggie.calcHamburgerPrice();
		System.out.println("Total hamburger price is $" + String.format ("%.2f", veggiePrice));

		DeluxeBurger deluxe = new DeluxeBurger();
		deluxe.addAddition3("shouldnt do this", 5.00);
		deluxe.calcHamburgerPrice();
    }
}
