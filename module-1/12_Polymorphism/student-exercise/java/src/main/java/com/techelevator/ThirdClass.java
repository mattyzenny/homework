package com.techelevator;

public class ThirdClass implements IDeliveryDriverInterface {

	//ATTRIBUTE VARIABLES//
	private String name;
	private double weightInOunces;
	private double rate;
	private double weightInPounds;
	private int distance;
	
	public ThirdClass(double weight, int distance) {
		this.weightInOunces = weightInOunces;
		this.weightInPounds = weightInPounds;
		this.distance = distance;
	}
	
	
	
	@Override
	public String name() {
		
		return this.name;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		double rate = distance * perMileRate;
		if(weight == 2) {
			perMileRate = .0020;
		}
		else if (weight == 8) {
			perMileRate = .0022;
		}
		else if (weight == 15) {
			perMileRate = .0024;
		}
		else if (weight == 16) {
			perMileRate = .0150;
		}
		else if (weight == 128) {
			perMileRate = .0160;
		}
		else if(weight > 128) {
			perMileRate = .05;
		}
		return rate;
	}
	
	
	
	
	
	
	
	
	
	
	
	//GETTERS/SETTERS//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}

	public double getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(double weightInPounds) {
		this.weightInPounds = weightInPounds;
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


	
}
