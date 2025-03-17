import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}

public class CustomComparator {
    public static void main(String[] args) {
        Person pp = null;
        // System.out.println(pp.name); // null pointer exception
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 20));
        people.add(new Person("Charlie", 30));

        System.out.println("Before  sorting : " + people);
        Collections.sort(people, new PersonAgeComparator());
        System.out.println("After sorting : " + people);

        /*
         * Simplify the sort operation using Lambda Expression
         */

        people.sort((p1, p2) -> p1.age - p2.age);
        // similar to arrow functions in javascript

        // NOTE: Also check this Problem "1636. Sort Array by Increasing Frequency"
    }
}
