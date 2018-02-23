package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Zeus", 9, 80, 2, 4, 1, 24,
                "Rhodesian Ridgeback");

        //dog.eat();
        //dog.walk();
        dog.run();
    }
}
