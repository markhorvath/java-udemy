package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(0, 100, false);
	    printer.printPages(10);
	    printer.printPages(5);
	    printer.fillToner(2);
	    printer.fillToner(20);
    }
}
