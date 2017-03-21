package edu.umss.model;

public class Person {

	
	private int personCI;
	private String personName;
	private String personLastName;
	
	public Person(int newCi, String newName, String newLastName) {
		personCI = newCi;
		personName = newName;
		personLastName = newLastName;
	}

	public int getPersonCI() {
		return personCI;
	}

	public String getPersonName() {
		return personName;
	}

	public String getPersonLastName() {
		return personLastName;
	}
		
}
