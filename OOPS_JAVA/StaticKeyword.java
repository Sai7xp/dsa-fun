
class Counter {
    String counterName;
    static int count = 9;
    static int count2;

    Counter(String counterName) {
        this.counterName = counterName;
    }

    // static block gets executed only once: first time the class is loaded into
    // memory
    static {
        System.out.println("Inside the static block of a class. This will run only once");
        count2 = count * 10;
    }

    static void foobar() {
        // greeting(); // Not possible. We can't access non-static methods in static
        System.out.println("I'm a static method. I belong directly to the class.");
        // this.name; // cannot use 'this' in a static context
    }

    void nonStaticMethod() {
        greeting(); // we can access non-static inside another non-static method directly
        foobar();
    }

    void greeting() {
        foobar();
        System.out.println("greeting()-> Hello. I'm " + this.counterName + " , belongs to instance of this class.");
    }

    static int add(int a, int b) {
        return a + b;
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        // Note: Check the usage of Counter class in HelloWorld.java

        System.out.println("count2: " + Counter.count2);
        System.out.println("Count 1 : " + Counter.count);
        Counter.count++;
        System.out.println("Count 1 after incrementing: " + Counter.count);

        Counter c = new Counter("API Counter");
        // c.greeting();
        c.nonStaticMethod();

        Counter.add(10, 30);

    }

}
