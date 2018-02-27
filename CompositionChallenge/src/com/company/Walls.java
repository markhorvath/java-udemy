package com.company;

public class Walls {
    private int count;
    private String material;
    private WallDimensions wallDimensions;

    public Walls(int count, String material, WallDimensions wallDimensions) {
        this.count = count;
        this.material = material;
        this.wallDimensions = wallDimensions;
    }

    public void buildWalls() {
        System.out.println("Built " + count + " walls made of " + material + ".");
    }
}
