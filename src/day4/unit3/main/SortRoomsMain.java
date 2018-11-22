package day4.unit3.main;

import day4.unit3.UniversityGenerator;
import day4.unit3.models.Room;
import day4.unit3.models.University;

import java.util.Collections;
import java.util.List;

public class SortRoomsMain {

	public static void main(String[] args) {
	    UniversityGenerator generator = new UniversityGenerator();
		University university = generator.generateUniversity();

		List<Room> rooms = university.getRooms();

        Collections.sort(rooms);

        for(Room room : rooms) {
            System.out.println(room);
        }
	}

	/*
    Correct Output:

    H4 [seats: 40, squareMeters: 45.2]
	H2 [seats: 50, squareMeters: 70.1]
	H3 [seats: 60, squareMeters: 75.3]
	H5 [seats: 100, squareMeters: 91.5]
	H1 [seats: 100, squareMeters: 120.2]
    */

}
