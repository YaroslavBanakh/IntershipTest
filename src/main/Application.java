package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko", 6));
        university.addStudent(new Student("Julia Veselkina",10 ));
        university.addStudent(new Student("Maria Perechrest", 4));

        System.out.println(university.getStudents());
        List<Student> students = university.getStudents();

        Internship internship = new Internship("Interlink");
        for (Student student:
             students) {
            if (student.getLevel()>5){
                internship.addIntern(student);
            }
        }

        System.out.println();
        System.out.println("List of internship's students:");
        List<Student> interns = internship.getInterns();
        System.out.println(interns);

    }
}
