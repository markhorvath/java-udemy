package com.company;

public class Room {
    private Walls walls;
    private Roof roof;

    public Room(Walls walls, Roof roof) {
        this.walls = walls;
        this.roof = roof;
    }

    public void buildRoom() {
        walls.buildWalls();
        roof.buildRoof();
    }

    public Walls getWalls() {
        return walls;
    }
}
