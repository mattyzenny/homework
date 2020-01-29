package com.techelevator;

public class Truck implements IVehicleInterFace {
	//ATTRIBUTES//
	private String type;
	private double calculateToll;
	private int numberOfAxles;
	
	//CONSTRUCTOR//
	public Truck(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}



	@Override
	public String type() {
		return type;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = numberOfAxles * distance;
		if (numberOfAxles == 4) {
			toll = distance * 0.040;
		}
		if(numberOfAxles == 6) {
			toll = distance *  0.045;
		}
		if (numberOfAxles >= 8) {
			toll = distance * 0.048;
		}

		return toll;
	}
		

	//GETTERS SETTERS//
	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public double getCalculateToll() {
		return calculateToll;
	}



	public int getNumberOfAxles() {
		return numberOfAxles;
	}



	
}
