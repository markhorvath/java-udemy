package com.company;

// Challenge

class Car {
    private int cylinders;
    private String name;
    private int wheels;
    private boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine() {
        return "Car engine has started.";
    }

    public String accelerate() {
        return "Car is accelerating.";
    }

    public String brake() {
        return "Car slammed the brakes!";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Tesla extends Car {
    public Tesla(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Tesla " + super.getName() + " engine has started.";
    }

    @Override
    public String accelerate() {
        return "Tesla " + super.getName() + " accelerates";
    }

    @Override
    public String brake() {
        return "Tesla " + super.getName() + " brakes";
    }
}

class Toyota extends Car {
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Toyota " + super.getName() + " engine has started.";
    }

    @Override
    public String accelerate() {
        return "Toyota " + super.getName() + " accelerates";
    }

    @Override
    public String brake() {
        return "Toyota " + super.getName() + " brakes";
    }
}

class GM extends Car {
    public GM(int cylinders, String name) {
        super(cylinders, name);
    }



    @Override
    public String startEngine() {
        return "GM " + super.getName() + " engine has started.";
    }

    @Override
    public String accelerate() {
        return "GM " + super.getName() + " accelerates";
    }

    @Override
    public String brake() {
        return "GM " + super.getName() + " brakes";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4, "Test Car");
        System.out.println(car.startEngine());
        System.out.println(car.brake());
        System.out.println(car.accelerate());

        Tesla tesla = new Tesla(7000, "Model S");
        System.out.println(tesla.startEngine());
        System.out.println(tesla.brake());
        System.out.println(tesla.accelerate());

        Toyota toyota = new Toyota(6, "Lexus RX 350");
        System.out.println(toyota.startEngine());
        System.out.println(toyota.brake());
        System.out.println(toyota.accelerate());

        GM gm = new GM(4, "Cadillac CTS");
        System.out.println(gm.startEngine());
        System.out.println(gm.brake());
        System.out.println(gm.accelerate());
    }


}



//class Movie {
//    private String name;
//
//    public Movie(String name) {
//        this.name = name;
//    }
//
//    public String plot() {
//        return "No plot here.";
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//class Jaws extends Movie {
//    public Jaws() {
//        super("Jaws");
//    }
//
//    public String plot() {
//        return "A shark hunts people";
//    }
//}
//
//class DarkKnight extends Movie {
//    public DarkKnight() {
//        super("The Dark Knight");
//    }
//
//    @Override
//    public String plot() {
//        return "Batman faces off vs. Joker";
//    }
//}
//
//class BladeRunner extends Movie {
//    public BladeRunner() {
//        super("Blade Runner");
//    }
//
//    @Override
//    public String plot() {
//        return "Humans and androids";
//    }
//}
//
//class StarWars extends Movie {
//    public StarWars() {
//        super("Star Wars");
//    }
//
//    @Override
//    public String plot() {
//        return "Jedi and Rebels vs Empire";
//    }
//}
//
//class ForgettableMovie extends Movie {
//    public ForgettableMovie() {
//        super("Forgettable");
//    }
//    // no plot method
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        for(int i = 1; i < 11; i++) {
//            Movie movie = randomMovie();
//            System.out.println("Movie #" + i +
//                                " : " + movie.getName() + "\n" +
//                                "Plot: " + movie.plot() + "\n");
//        }
//    }
//
//    public static Movie randomMovie() {
//        int randomNumber = (int) (Math.random() * 5) + 1;
//        System.out.println("Random number = " + randomNumber);
//        switch(randomNumber) {
//            case 1:
//                return new Jaws();
//            case 2:
//                return new DarkKnight();
//            case 3:
//                return new BladeRunner();
//            case 4:
//                return new StarWars();
//            case 5:
//                return new ForgettableMovie();
//        }
//        return null;
//    }
//}
