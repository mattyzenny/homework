package com.techelevator;

public class Truck implements IVehicleInterFace {
	//ATTRIBUTES//
	private String type;
	private double calculateToll;
	private int numberOfAxles;
	private int distance;
	
	



	//CONSTRUCTOR//
	public Truck(int distance, int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
		this.distance = distance;
	}

	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s", "Truck", distance, formattedToll);
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

	public int getDistance() {
		return distance;
	}



	public void setDistance(int distance) {
		this.distance = distance;
	}


	public double getCalculateToll() {
		return calculateToll;
	}



	public int getNumberOfAxles() {
		return numberOfAxles;
	}



	
}
