package Inheritance;

// Grandparent Class
class Vehicle {
    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Parent Class
class Car extends Vehicle { // Inherits from Vehicle
    int numberOfDoors;

    public Car(int speed, int numberOfDoors) {
        super(speed); // Calls Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Car is driving with " + numberOfDoors + " doors.");
    }
}

// Child Class
class SportsCar extends Car { // Inherits from Car
    boolean turboMode;

    public SportsCar(int speed, int numberOfDoors, boolean turboMode) {
        super(speed, numberOfDoors); // Calls Car constructor
        this.turboMode = turboMode;
    }

    public void activateTurbo() {
        if (turboMode) {
            System.out.println("Turbo mode activated! Speed: " + speed + " km/h");
        } else {
            System.out.println("Turbo mode is off.");
        }
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        // Create an object of SportsCar
        SportsCar mySportsCar = new SportsCar(200, 2, true);

        // Access methods from all levels of inheritance
        mySportsCar.start(); // From Vehicle
        mySportsCar.drive(); // From Car
        mySportsCar.activateTurbo(); // From SportsCar
        mySportsCar.stop(); // From Vehicle
    }
}