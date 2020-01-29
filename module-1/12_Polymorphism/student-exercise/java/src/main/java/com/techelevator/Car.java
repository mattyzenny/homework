package com.techelevator;

public class Car implements IVehicleInterFace {

	//ATTRIBUTES//
	private boolean hasTrailer;
	private String type;
	private double calculateToll;
	private int distance;



	//CONSTRUCTOR//
	Car(boolean hasTrailer) {
		
		this.hasTrailer = hasTrailer;
	}

	
	@Override
	public String type() {

		return type;
	}

	@Override
	public double calculateToll(int distance) {
		double toll = distance * 0.020;
		if (hasTrailer == true) {
			return toll += 1.00;
		}
		return toll;
	}
	
	//GETTERS//
	
	
	public String getType() {
		if(hasTrailer) {
			return "Car (with trailer)";
		}
			else return "Car";
			
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

	public void setHasTrailer(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	//GETTER//
	public boolean isHasTrailer() {
		return hasTrailer;
	}
	
}
