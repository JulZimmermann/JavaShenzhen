package day4.unit3.main;

import day4.unit3.UniversityGenerator;
import day4.unit3.comparators.StudentIdComparator;
import day4.unit3.models.Student;
import day4.unit3.models.University;

import java.util.Collections;
import java.util.List;

public class SortStudentMain {

    public static void main(String[] args) {
        UniversityGenerator generator = new UniversityGenerator();
        University university = generator.generateUniversity();

        List<Student> students = university.getStudents();

        Collections.sort(students, new StudentIdComparator());

        for(Student student : students) {
            System.out.println(student);
        }
    }

    /*
    Correct Output:

    Robert [Gender: m, Age: 21, ID: 1]
    Olivia [Gender: w, Age: 18, ID: 5]
    Amelia [Gender: w, Age: 25, ID: 9]
    Jack [Gender: m, Age: 24, ID: 17]
    Michael [Gender: m, Age: 19, ID: 18]
    Tobias [Gender: m, Age: 22, ID: 40]
    */

}
