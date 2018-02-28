package com.company;

public class Printer {
    private int pagesPrinted = 0;
    private float tonerLevel = 100;
    private boolean isDuplex;

    public Printer(int pagesPrinted, float tonerLevel, boolean isDuplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = tonerLevel;
        this.isDuplex = isDuplex;
    }

    public void fillToner(float addedToner) {
        if(addedToner > 0 && addedToner <= 100) {
            this.tonerLevel += addedToner;
            if (this.tonerLevel > 100) {
                this.tonerLevel = 100;
            }
        }
        System.out.println("Toner filled to " + this.tonerLevel + "%.");
    }

    public void printPages(int pageCount) {
        while (pageCount > 0) {
            this.pagesPrinted++;
            this.tonerLevel -= 0.5;
            pageCount--;
        }
        System.out.println("Printed " + pageCount + " pages using " + tonerLevel + "% of toner.  Total pages printed" +
                "= " + pagesPrinted);
    }


}
