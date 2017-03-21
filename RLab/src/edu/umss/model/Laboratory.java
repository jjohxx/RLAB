package edu.umss.model;

public class Laboratory {

	private int labId;
	private String labName;

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

}
