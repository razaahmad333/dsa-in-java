package OOPS;

import java.util.List;
import java.util.ArrayList;

public class School {
    String name;
    List<Student> students = new ArrayList<Student>();
    List<Teacher> teachers = new ArrayList<Teacher>();
    List<Course> courses = new ArrayList<Course>();

    School(String name) {
        this.name = name;
    }

    School(String name, List<Course> courses) {
        this.name = name;
        this.courses = courses;
    }

    void printTotalStudents() {
        System.out.println("Total students: " + students.size());
    }

    void printTotalTeachers() {
        System.out.println("Total teachers: " + teachers.size());
    }

    void addCourse(Course course) {
        courses.add(course);
    }

    void printTeachersNameAndCourse() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher.name + " teaches " + teacher.course.name);
            System.out.printf("to ");
            for (Student student : teacher.course.students) {
                System.out.printf(student.name + ", ");
            }
            System.out.println();
        }
    }

}
