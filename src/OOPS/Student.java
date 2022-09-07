package OOPS;

import java.util.List;
import java.util.ArrayList;

public class Student extends Human {
    School school;
    List<Course> courses = new ArrayList<Course>();
    List<Teacher> teachers = new ArrayList<Teacher>();

    Student(String name, int age, School school) {
        super(name, age);
        this.school = school;
        school.students.add(this);
        Human.population++;
    }

    void assignTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    void assignCourse(Course course) {
        courses.add(course);
        course.assignStudent(this);
    }

    void printCoursesAndTeacher() {
        System.out.println(this.name + " is enrolled in:");

        if (courses.size() == 0) {
            System.out.println("No courses");
            return;
        }

        for (Course course : courses) {
            System.out.println(course.name + " - taught by " + course.teacher.name);
        }
    }
}
