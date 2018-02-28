package com.company;

public class EnhancedPlayer {
    private String name;
    // Making them private makes sure class fields arent accessible to any classes outside
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // this is also part of encapsulation I think, its validation that only allows
        // an other class to assign a value to hitPoints if its within range, otherwise default 100
        if(health > 0 && health <= 100) {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitPoints -= damage;
        if(this.hitPoints <= 0) {
            System.out.println("Player " + name + " was knocked out.");
            // Reduce number of lives for player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
