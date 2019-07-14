package practice;

class Person {

    // Instance variables (data or "state")
    String name;
    int age;


    // Classes can contain

    // 1. Data
    // 2. Subroutines (methods)
}

public class CreateObjects {

    public static void main(String[] args) {


        // Create a Person object using the Person class
        Person person1 = new Person();
        person1.name = "Zsena";
        person1.age = 30;

        // Create a second Person object
        Person person2 = new Person();
        person2.name = "Gabor";
        person2.age = 33;

        System.out.println(person1.name);
        System.out.println(person2.name);

    }
}
