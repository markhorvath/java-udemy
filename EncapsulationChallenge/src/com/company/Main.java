package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Printed pages was " + pagesPrinted + " New total print count for printer = " +
        printer.getPagesPrinted());
        pagesPrinted = printer.printPages(7);
        System.out.println("Printed pages was " + pagesPrinted + " New total print count for printer = " +
                printer.getPagesPrinted());
    }
}
