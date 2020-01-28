package com.techelevator;

public class Airplane {

	//INSTANCE VARIABLES//
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	
	
	//CONSTRUCTOR//
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	this.planeNumber = planeNumber;
	this.totalCoachSeats = totalCoachSeats;
	this.totalFirstClassSeats = totalFirstClassSeats;
	}
	
	
	//METHOD//
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		while(forFirstClass == true) {
				if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
					bookedFirstClassSeats = totalNumberOfSeats + bookedFirstClassSeats;
					return true;
				}
				else {
					return false;
				}
		
		}
	
		if(forFirstClass == false) {
			if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
			bookedCoachSeats = totalNumberOfSeats + bookedCoachSeats;
			return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	public int getAvailableFirstClassSeats () {
		return totalFirstClassSeats - bookedFirstClassSeats; 
	}
	public int getAvailableCoachSeats () {
		return totalCoachSeats - bookedCoachSeats;
	}
	
	
	
	
	
	
	
	public String getPlaneNumber() {
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	
	
	
	
	
	
	
	
	
	
}
