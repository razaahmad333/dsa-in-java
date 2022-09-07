package OOPS;

public class Human {
    String name;
    int age;
    static long population;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void sayHello(Human h) {
        System.out.println("Hello " + h.name);
    }
}
