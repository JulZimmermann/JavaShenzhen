package day4.unit3.main;

import day4.unit3.UniversityGenerator;
import day4.unit3.comparators.ProfessorLectureDurationComparator;
import day4.unit3.models.Professor;
import day4.unit3.models.University;

import java.util.Collections;
import java.util.List;

public class SortProfessorMain {

    public static void main(String[] args) {
        UniversityGenerator generator = new UniversityGenerator();
        University university = generator.generateUniversity();

        List<Professor> professors = university.getProfessor();

        Collections.sort(professors, new ProfessorLectureDurationComparator());

        for(Professor professor : professors) {
            System.out.println(professor);
        }
    }

    /*
    Correct Output:

    Oliver [Gender: m, Age: 58]
    Wilson [Gender: m, Age: 43]
    Smith [Gender: m, Age: 45]
    Wood [Gender: m, Age: 33]
    Brown [Gender: m, Age: 48]
    */

}
