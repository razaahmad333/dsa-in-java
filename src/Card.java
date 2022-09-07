public class Card {
    public static void main(String[] args) throws Exception {
        System.out.println("helllo card");
        String name = "ahmad raza";
        int age = 19;
        age = 12;
        float marks = 11.11f;
        double networth = 12.32;
        // checkingReference(age);
        char grade = 'D';
        boolean Passed = false;
        hello(name, age, marks, networth, grade, Passed);

    }

    public static void hello(String name, int age, float marks, double networth, char grade, boolean passed) {
        System.out.println("hello " + name);
        System.out.println("your age is " + age);
        System.out.println("your marks is " + marks);
        System.out.println("your networth is " + networth);
        System.out.println((int) grade);

        if (name == "ahmad raza") {
            console_log("I know you");
        }

        if (Character.compare(grade, 'A') == 0) {
            print("equal to A");
        } else if (Character.compare(grade, 'B') == 0) {
            print("equal to B");
        } else if (grade == 'C') {
            print("equal to C");
        } else {
            print("ab kitna niche bhai sahab");
        }

        if (passed) {
            print("congratulations " + name + " you passed your class");
        } else {
            print("oops you failed your classes");
        }
    }

    public static void print(String txt) {
        System.out.println(txt);
    }

    public static void console_log(String txt) {
        System.out.println(txt);
    }

    public static void checkingReference(int varo) {
        varo = 2;
    }
}
