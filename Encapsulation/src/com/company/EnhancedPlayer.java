package com.company;

public class EnhancedPlayer {
    private String name;
    // Making them private makes sure class fields arent accessible to any classes outside
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // this is also part of encapsulation I think, its validation that only allows
        // an other class to assign a value to health if its within range, otherwise default 100
        if(health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if(this.health <= 0) {
            System.out.println("Player " + name + " was knocked out.");
            // Reduce number of lives for player
        }
    }

    public int getHealth() {
        return health;
    }
}
