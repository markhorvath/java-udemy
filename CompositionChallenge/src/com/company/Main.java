package com.company;

public class Main {

    public static void main(String[] args) {
        WallDimensions wallDimensions = new WallDimensions(25, 14, 2);
        Walls walls = new Walls(4, "brick", wallDimensions);
        Roof roof = new Roof(25, 25, "wood");

        Room livingRoom = new Room(walls, roof);
        livingRoom.buildRoom();
    }
}
