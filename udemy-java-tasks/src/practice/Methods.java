package practice;

class Persons {

    // Instance variables (data or "state")
    String name;
    int age;

    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old ");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}

public class Methods {
    public static void main(String[] args) {

        // Create a Person object using the Persons class
        Persons person1 = new Persons();
        person1.name = "Zsena";
        person1.age = 30;
        person1.speak();
        person1.sayHello();

        // Create a second Person object
        Persons person2 = new Persons();
        person2.name = "Gábor";
        person2.age = 33;
        person2.speak();
        person1.sayHello();

        System.out.println(person1.name);

    }

}
