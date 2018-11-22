package day4.unit3;

import day4.unit3.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityGenerator {

    public University generateUniversity() {
        University fhws = new University("FHWS", "Würzburg");

        //add Students
        List<Student> students = generateStudents(5000);
        fhws.setStudents(students);

        //add Professors
        List<Professor> professors = generateProfessors(15);
        fhws.setProfessor(professors);

        //add Rooms
        List<Room> rooms = generateRooms();
        fhws.setRooms(rooms);

        return fhws;
    }

    private static List<Student> generateStudents(int count){
        return Arrays.asList(
                new Student("Tobias", 'm', 22, 40),
                new Student("Robert", 'm', 21, 1),
                new Student("Michael", 'm', 19, 18),
                new Student("Olivia", 'w', 18, 5),
                new Student("Amelia", 'w', 25, 9),
                new Student("Jack", 'm', 24, 17)
        );
    }

    private List<Professor> generateProfessors(int count){
        Professor smith = new Professor("Smith", 'm', 45);

        smith.setLectures(Arrays.asList(
                new Lecture("Programming 1", 90),
                new Lecture("Programming 2",120)
        ));

        Professor wood = new Professor("Wood", 'm', 33);

        wood.setLectures(Arrays.asList(
                new Lecture("Database", 90),
                new Lecture("Business Infromation Systems",120)
        ));

        Professor brown = new Professor("Brown", 'm', 48);

        brown.setLectures(Arrays.asList(
                new Lecture("Internation Software Engendering", 180),
                new Lecture("Parallel und Distributed Systems",120)
        ));


        Professor oliver = new Professor("Oliver", 'm', 58);

        oliver.setLectures(Arrays.asList(
                new Lecture("IT-Laws",150)
        ));

        Professor wilson = new Professor("Wilson", 'm', 43);

        wilson.setLectures(Arrays.asList(
                new Lecture("Operation Systems", 180)
        ));

        return Arrays.asList(smith, wood, brown, oliver, wilson);
    }

    private List<Room> generateRooms(){
        List<Room> rooms = new ArrayList<>();

        rooms.add(new Room("H1",100,120.20));
        rooms.add(new Room("H2",50,70.10));
        rooms.add(new Room("H3",60,75.30));
        rooms.add(new Room("H4",40,45.20));
        rooms.add(new Room("H5",100,91.50));

        return rooms;
    }

    private List<Lecture> generateLectures(){
        List<Lecture> lectures = new ArrayList<>();

        lectures.add(new Lecture("Programming 1", 90));
        lectures.add(new Lecture("Programming 2",120));
        lectures.add(new Lecture("Economics",120));
        lectures.add(new Lecture("Business Intelligence 1",180));
        lectures.add(new Lecture("Conversion Optimierung 1",180));
        lectures.add(new Lecture("Web-Management 1",180));
        lectures.add(new Lecture("IT-Laws",120));
        lectures.add(new Lecture("Web- & Script Languages",120));

        return lectures;
    }

}
