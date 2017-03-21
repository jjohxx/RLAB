package edu.umss.controller;

import org.apache.commons.lang3.StringUtils;

import edu.umss.model.Laboratory;

public class LabManager {

	public void makeReservation(Connection connection, int labId, String labName, String ownerName) {
		if (labId != 0 && StringUtils.isNotEmpty(ownerName)) {
			
		} else if(StringUtils.isNotEmpty(labName) && StringUtils.isNotEmpty(ownerName)) {
			
		}
	}
	
	public void registerLaboratory(String newLabName) {
		
	}
	
	public Laboratory getLaboratoryById(int labId) {
		return null;
	}
	
}
