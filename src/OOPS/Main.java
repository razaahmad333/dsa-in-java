package OOPS;

public class Main {
    public static void main(String[] args) {

        // Planet earth = Planet.getPlanet("C-53");

        School fps = new School("Faizabad Public School");

        Course math = new Course("Math");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");

        Teacher fareed = new Teacher("Fareed", 30, fps, math);
        // Teacher alakh = new Teacher("Alakh", 30, fps, physics);
        Teacher sana = new Teacher("Sana Khan", 30, fps, chemistry);

        Student farhad = new Student("Farhad", 20, fps);
        Student ali = new Student("Ali", 20, fps);
        Student sajid = new Student("Sajid", 20, fps);
        // Student farhan = new Student("Farhan", 20, fps);

        System.out.println(Human.population);

        fareed.sayHello(sana);
        System.out.println(fareed.course.name);

        fps.addCourse(math);
        fps.addCourse(physics);
        fps.addCourse(chemistry);

        farhad.assignCourse(math);
        farhad.assignCourse(physics);

        ali.assignCourse(math);
        ali.assignCourse(chemistry);

        fps.printTotalStudents();
        fps.printTotalTeachers();
        System.out.println();
        fps.printTeachersNameAndCourse();
        System.out.println();

        // farhad.printCoursesAndTeacher();

        sajid.printCoursesAndTeacher();
    }
}
