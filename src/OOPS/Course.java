package OOPS;

import java.util.List;
import java.util.ArrayList;

public class Course {
    String name;
    List<Student> students = new ArrayList<Student>();
    Teacher teacher;

    Course(String name) {
        this.name = name;
    }

    void assignStudent(Student student) {
        students.add(student);

    }

    void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
