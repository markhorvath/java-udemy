package com.company;

public class Vehicle {

    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at: " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move() moving at " + currentVelocity + "mph in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    //    private int wheels;
//    private int doors;
//    private String type;
//    private String engine;
//
//    public Vehicle(int wheels, int doors, String type, String engine) {
//        this.wheels = wheels;
//        this.doors = doors;
//        this.type = type;
//        this.engine = engine;
//    }
//
//    public int getWheels() {
//        return wheels;
//    }
//
//    public int getDoors() {
//        return doors;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public String getEngine() {
//        return engine;
//    }
}
