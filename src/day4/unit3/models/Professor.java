package day4.unit3.models;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Person {

	private List<Lecture> lectures = new ArrayList<>();
	
	public Professor(String name, char gender, int age) {
		super(name, gender, age);
	}

	public List<Lecture> getLectures() {
		return lectures;
	}

	public void setLectures(List<Lecture> lectures) {
		this.lectures = lectures;
	}
	
	@Override
	public String toString() {
		return getName()+" [Gender: "+getGender()+", Age: "+getAge()+"]";
	}

}
