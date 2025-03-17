
/* 
 * Let's say we have one template who ever extends it they must implement all the methods 
 * that are mentioned in that template, this is not possible with normal classes because if
 * we extend any class it is optional to override and implement all the methods that a parent class
 * has. and what if we want some code to be shared to all child classes so that they don't have to write 
 * the same code again. And more importantly nobody can use the template directly, they should extend it
 * into their own class and make use of it.
 * 
 * This is where abstract classes comes into the picture. we can define some abstract methods in abstract class
 * and whoever extends it must implement those methods. and abstract classes can also have concrete methods which
 * can be used by child classes.
 * 
 * They force subclasses to implement the abstract methods so that every child class will follow a common structure.
 * Since abstract classes cannot be instantiated, they serve as templates that must be extended.
 */

// Abstract class

import java.util.Arrays;

abstract class PaymentMethod {
    String userId;
    private String payerName;

    // Constructor
    PaymentMethod(String payerName, String userId) {
        this.payerName = payerName;
        this.userId = userId;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void processPayment(double amount);

    // Concrete method (shared by all subclasses)
    public void logTransaction(double amount) {
        System.out.println("Transaction logged: " + payerName + " paid $" + amount);
    }

    // Concrete method (shared by all subclasses)
    public String getPayerName() {
        return payerName;
    }
}

// Concrete subclass: CreditCard
class CreditCard extends PaymentMethod {
    private String cardNumber;

    public CreditCard(String payerName, String userId, String cardNumber) {
        super(payerName, userId);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card number " + cardNumber);
        logTransaction(amount); // Reusing the common method
    }
}

// Concrete subclass: PayPal
class PayPal extends PaymentMethod {
    private String email;

    public PayPal(String payerName, String userId, String email) {
        super(payerName, userId);
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " for email " + email);
        logTransaction(amount); // Reusing the common method
    }
}

// Main class
public class AbstractClasses {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard("John Doe", "uuid", "1234-5678-9012-3456");
        PaymentMethod payPal = new PayPal("Jane Doe", "uuid2", "jane.doe@example.com");

        creditCard.processPayment(100.0);
        payPal.processPayment(200.0);

        PayPal pp = new PayPal("Paypal User", "uuid3", "user@paypal.com");
        System.out.println("userId from PayPal class belongs to PaymentMethod abstract class: " + pp.userId);

        /*
        * 
        */
        System.out.println("Cart Checkout Feature");
        CartCheckout checkout = new CartCheckout(pp, new String[] { "macbook", "ipad" }, 100.0);
        checkout.confirmCheckout();
    }
}

class CartCheckout {
    private PaymentMethod paymentMethod;
    private String[] items;
    private double amount;

    CartCheckout(PaymentMethod pm, String[] items, double amount) {
        this.paymentMethod = pm;
        this.items = items;
        this.amount = amount;
    }

    void confirmCheckout() {
        System.out.println("Confirm Checkout");
        this.paymentMethod.processPayment(this.amount);
        // this.paymentMethod.logTransaction(this.amount);
        System.out.println(Arrays.toString(this.items) + " sent to dispatch service");
    }
}