package com.company;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark hunts people";
    }
}

class DarkKnight extends Movie {
    public DarkKnight() {
        super("The Dark Knight");
    }

    @Override
    public String plot() {
        return "Batman faces off vs. Joker";
    }
}

class BladeRunner extends Movie {
    public BladeRunner() {
        super("Blade Runner");
    }

    @Override
    public String plot() {
        return "Humans and androids";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Jedi and Rebels vs Empire";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable");
    }
    // no plot method
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                                " : " + movie.getName() + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number = " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new DarkKnight();
            case 3:
                return new BladeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();
        }
        return null;
    }


}
