package com.techelevator;

public class Car implements IVehicleInterFace {

	//ATTRIBUTES//
	private boolean hasTrailer;
	private String type;
	private double calculateToll;
	private int distance;
	private int totalMiles;




	//CONSTRUCTOR//
	Car(boolean hasTrailer, int distance) {
		this.hasTrailer = hasTrailer;
		this.distance = distance;
	}

	public String toString() {
		String formattedToll = String.format("$%.2f", calculateToll(distance));
		
		return String.format("%1$-16s %2$-22s %3$s", "Car", distance, formattedToll);
	}
	@Override
	public String type() {
		if (hasTrailer) {
			return "car with trailer";
		}
		else return "car";
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
		if(hasTrailer==true) {
			return "Car (with trailer)";
		}
			else return "Car";
			
		}
	
	

	public int getTotalMiles() {
		return totalMiles;
	}

	public void setTotalMiles(int totalMiles) {
		this.totalMiles = totalMiles;
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
