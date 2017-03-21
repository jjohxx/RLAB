package edu.umss.controller;

public class ReservationLab {
	
	private LabManager labManager;
	private static Connection connection;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connection = new Connection();
		new ReservationLab();
	}
	
	public ReservationLab() {
		labManager = new LabManager();
	}
	
	public void reserveLaboratoryByName(String labName, String ownerName) {
		reserveLaboratory(0, labName, ownerName);
	}
	
	public void reserveLaboratoryByLabId(int labId, String ownerName) {
		reserveLaboratory(labId, "", ownerName);
	}
	
	public void reserveLaboratory(int labId, String labName, String ownerName) {
		labManager.makeReservation(connection, labId, labName, ownerName );
	}
	
}
