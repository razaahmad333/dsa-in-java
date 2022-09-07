package OOPS;

public class Intro {

    public static void main(String[] args) {
        // System.out.println("Hello OOPS");

        Intro obj = new Intro();
        obj.sayHello();
        // Person[] ahmad = new Person[] {
        // new Person(2), new Person(3), new Person(6), new Person(0)
        // };

        // ahmad[0].greetBro();

        // System.out.println(ahmad[2].getAge());
    }

    void sayHello() {
        System.out.println("Hello");
    }

}

class Person {
    Integer e;

    int age;
    final int PI = 2;

    static {
        // final double PI = 3.14;
    }

    Person(int age) {
        this.age = age;
        e = 3;
        // PI = 4;
    }

    public void greetBro() {
        System.out.println("Hi there I'm" + Integer.toString(e));
    }

    int getAge() {
        return age;
    }

    public String toString() {
        return Integer.toString(age);
    }

}
