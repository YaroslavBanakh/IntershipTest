package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {
    List<Student> students = new ArrayList<>();

    public University(String name) {
        //TODO: Implementation is needed
    }

    public void setStudent(Student student) {

    }

    public List<Student> getStudents() {
        return students;
    }


    public void addStudent(Student student) {
        students.add(student);
    }
}
