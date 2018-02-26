package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27in Beast", "HP", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Intel", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, motherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}
