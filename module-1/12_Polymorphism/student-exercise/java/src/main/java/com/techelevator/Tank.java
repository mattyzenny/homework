package com.techelevator;

public class Tank implements IVehicleInterFace {

	private String type;
	private double calculateToll;
	
	
	@Override
	public String type() {

		return type;
	}

	@Override
	public double calculateToll(int distance) {

		return 0;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getCalculateToll() {
		return calculateToll;
	}

	public void setCalculateToll(double calculateToll) {
		this.calculateToll = calculateToll;
	}



}
