package OOPS;

public class Teacher extends Human {
    School school;
    Course course;

    Teacher(String name, int age, School school, Course course) {
        super(name, age);
        this.school = school;
        this.course = course;
        Human.population++;
        school.teachers.add(this);
        course.assignTeacher(this);
    }

    void assignStudent(Student student) {
        student.assignTeacher(this);
    }
}
