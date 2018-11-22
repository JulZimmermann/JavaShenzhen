package day4.unit3.models;

public class Room implements Comparable<Room> {
	private String id;
	private int seats;
	private double squareMeters;

	public Room(String id, int seats, double squareMeters) {
		this.id = id;
		this.seats = seats;
		this.squareMeters = squareMeters;
	}

	@Override
	public int compareTo(Room o) {
        // TODO implement sorting by number of seats ascending. If both are equal sort by square meters ascending.
        throw new RuntimeException("Not implemented!");
	}

    @Override
    public String toString() {
        return id + " [" +
                "seats: " + seats +
                ", squareMeters: "  + squareMeters +
                ']';
    }
}
