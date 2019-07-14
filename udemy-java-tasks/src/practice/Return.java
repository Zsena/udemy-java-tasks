package practice;

class Persons3 {
    String name;
    int age;

    /*void speak() {
        System.out.println("My name is: " + name);
    }*/

    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}


public class Return {
    public static void main(String[] args) {
        Persons3 person1 = new Persons3();

        person1.name = "Zsena";
        person1.age = 30;

        // person1.speak();


        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);

        int years = person1.calculateYearsToRetirement();

        System.out.println("Years till retirements: " + years);

    }
}
