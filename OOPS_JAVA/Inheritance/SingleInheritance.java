package Inheritance;
/*
* Created on 11 Mar 2025
* 
* @author Sai Sumanth
*/

/* 
 * SingleInheritance B extends A 
 * A child class inherits from only one parent class.
 * 
 * eg: Customer inherits from User
 */
class User {
    int yob;
    String email;
    private String password; // can be accessed on in this class, not even in subclasses or any other classes

    public User(int yob, String email, String password) {
        super(); // this will call Object class constructor. Super class of User is Object

        this.yob = yob;
        this.email = email;
        this.password = password;
    }

    // create a copy of user
    User(User originalUser) {
        this.yob = originalUser.yob;
        this.email = originalUser.email;
        this.password = originalUser.password;
    }

    public boolean login() {
        System.out.println("Your password:" + this.password + " is correct");
        return true;
    }

}

class Customer extends User {
    String shippingAddress;
    String email; // same field exists in User class

    public Customer(int yob, String email, String password, String address) {
        super(yob, email, password); // calls parent class constructor
        this.shippingAddress = address;

        super.email = email;
        this.email = email;
        // email can be accessed using both `this` & `super`
        // then why super ? It's useful when both the parent class and child
        // class have a property with same name. with super and this we can
        // differentiate that property
    }

    // use if for creating a copy of Customer from existing Customer
    public Customer(Customer originalCustomer) {
        super(originalCustomer); //
        this.shippingAddress = originalCustomer.shippingAddress;
        this.email = originalCustomer.email;
    }

}

public class SingleInheritance {
    public static void main(String[] args) {

        User user1 = new User(2005, "john@test.com", "123+salt");
        System.out.println(user1.toString());
        user1.login();

        Customer c1 = new Customer(1990, "cust@gmail.com", "hashed", "SO");
        // c1.password = ""; // ❌ password field can't be accessed since it's private
        c1.login();

        System.out.println(c1.shippingAddress);

        User custUser = new Customer(2001, "test@cust.user", "123456", "NY");
        // custUser.shippingAddress // ❌ this is not possible since shippingAddress is a
        // field of Customer, but the type is User and User doesn't have a
        // shippingAddress property
        System.out.println(custUser);

        System.out.println("All the public constructors of " + c1.getClass());
        for (var x : custUser.getClass().getConstructors()) {
            System.out.println(x);

        }
    }
}