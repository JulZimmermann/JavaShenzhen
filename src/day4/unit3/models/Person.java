package day4.unit3.models;

public class Person implements Comparable<Person> {
	private String name;
	private char gender;
	private int age;

	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// TODO implement sorting by name lexicographically
		throw new RuntimeException("Not implemented!");
	}
}
