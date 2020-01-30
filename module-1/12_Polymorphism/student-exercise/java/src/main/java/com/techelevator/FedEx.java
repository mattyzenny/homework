package com.techelevator;

public class FedEx implements IDeliveryDriverInterface {

	
	//ATTRIBUTES//
	private String name;
	private double weightInOunces;
	private double rate;
	private double weightInPounds;
	private int distance;
	
	
	
	public FedEx(double weight, int distance) {
		this.distance = distance;
		this.weightInPounds = weightInPounds;
		this.weightInOunces = weightInOunces;
	}
	
	
	//METHODS//
	
	
	
	
	
	
	
	
	

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 20.00;
		if (distance > 500){
			rate += 5.00;
		if(weight > 48) {
			rate+= 3.00;
		}
		}
		return rate;
	
	}


	//GETTERS SETTERS//

	
	
public String getName() {
	return name;
}

public double getWeightInOunces() {
	return weightInOunces;
}

public double getWeightInPounds() {
	return weightInPounds;
}

public void setWeightInPounds(double weightInPounds) {
	this.weightInPounds = weightInPounds;
}

public void setWeightInOunces(double weightInOunces) {
	this.weightInOunces = weightInOunces;
}

public double getRate() {
	return rate;
}

public void setRate(double rate) {
	this.rate = rate;
}

public int getDistance() {
	return distance;
}


public void setDistance(int distance) {
	this.distance = distance;
}


public void setName(String name) {
	this.name = name;
}
}
