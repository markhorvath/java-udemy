package com.company;

public class Printer {
    private int pagesPrinted;
    private int tonerLevel;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }

        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode." + pagesToPrint);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

}
