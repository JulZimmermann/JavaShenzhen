package day4.unit3.models;

public class Student extends Person {

	private int id;
	private String name;
	private char gender;
	private int age;
	
	public Student(String name, char gender, int age, int id) {
		super(name, gender, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return getName()+" [Gender: "+getGender()+", Age: "+getAge()+", ID: "+getId()+"]";
	}

}
