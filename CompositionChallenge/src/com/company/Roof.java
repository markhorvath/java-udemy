package com.company;

public class Roof {
    private int width;
    private int length;
    private String material;

    public Roof(int width, int length, String material) {
        this.width = width;
        this.length = length;
        this.material = material;
    }

    public void buildRoof() {
        System.out.println("Roof made of " + material + " " + width + "ft by " + length + "ft built.");
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }
}
