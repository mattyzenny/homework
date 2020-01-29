package com.techelevator;

public class Tank implements IVehicleInterFace {

	private String type;
	private double calculateToll;
	private int distance;
	
	
	Tank(int distance){
		this.distance = distance;
	}
	@Override
	public String type() {

		return type;
	}

	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s", "Tank", distance, formattedToll);
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

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

}
