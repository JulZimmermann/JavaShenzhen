package day4.unit3.models;

public class Lecture {
	
	private String name;
	private int durationMinutes;
	
	public Lecture(String name, int durationMinutes) {
		this.name = name;
		this.durationMinutes = durationMinutes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

}
