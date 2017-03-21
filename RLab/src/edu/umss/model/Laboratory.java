package edu.umss.model;

public class Laboratory {

	private int labId;
	private String labName;
	private Person owner;

	public Laboratory(int newId) {
		labId = newId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public int getLabId() {
		return labId;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}
