
/* 
 * 1. Compile-Time Polymorphism (Method Overloading)
 * 
 * Also called as Static Polymorphism
 */

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

/*
 * 2. Runtime Polymorphism (Method Overriding)
 * 
 * Also called as Dynamic Polymorphism
 * 
 */

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Animal making sound");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        // super.makeSound(); // call this super makeSound only if you want parent
        // behaviour as well
        System.out.println("Meow Meow");
    }

    void climbTree() {
        System.out.println(this.name + " Cat is climbing tree");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Bow Bow");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Compile Time Polymorphism
        Calculator calc = new Calculator();

        System.out.println("COMPILE TIME POLYMORPHISM");
        System.out.println(calc.add(5, 10)); // Calls add(int, int)
        System.out.println(calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println(calc.add(5.5, 10.5)); // Calls add(double, double)

        // Runtime Polymorphism
        System.out.println("RUNTIME POLYMORPHISM");

        Animal ani = new Animal("fox");
        ani.makeSound();

        ani = new Cat("Dolly");
        ani.makeSound();

        ani = new Dog("Bruno");
        ani.makeSound();

        Animal a2 = new Cat("Tipsy");
        a2.makeSound(); // During Runtime this will call makeSound method of Cat class since it's
                        // overrided
        // a2.climbTree(); // ❌ climbTree() is not defined in Animal

        Cat c1 = new Cat("Tangy");
        c1.makeSound();
        c1.climbTree();

        // Runtime polymorphism Real world example
        RuntimePolymorphismExample.main(new String[] {});

    }
}

// Interface
interface Payment {
    void pay(double amount);
}

// Implementing Classes
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Credit Card.");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}

class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via UPI.");
    }
}

class RuntimePolymorphismExample {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment(); // Payment reference pointing to CreditCardPayment
        Payment payment2 = new PayPalPayment(); // Payment reference pointing to PayPalPayment
        Payment payment3 = new UPIPayment(); // Payment reference pointing to UPIPayment

        // Call the same method on different objects
        payment1.pay(100.0); // Output: Paid 100.0 via Credit Card.
        payment2.pay(50.0); // Output: Paid 50.0 via PayPal.
        payment3.pay(200.0); // Output: Paid 200.0 via UPI.

        // Now we can use Payment interface every where in our code and based on the
        // requirement we can pass any payment option that implements pay() method
    }
}
