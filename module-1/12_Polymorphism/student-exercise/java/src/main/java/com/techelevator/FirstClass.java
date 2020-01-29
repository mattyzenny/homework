package com.techelevator;

public class FirstClass implements IDeliveryDriverInterface {

	
	//ATTRIBUTES//
	private String name;
	private double weightInOunces;
	private double rate;
	private double weightInPounds;
	
	
	@Override
	public String name() {
	
		return this.name;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		if(weight == 2) {
			perMileRate = .035;
		}
		else if (weight == 8) {
			perMileRate = .040;
		}
		else if (weight == 15) {
			perMileRate = .047;
		}
		else if (weight == 16) {
			perMileRate = .195;
		}
		else if (weight == 128) {
			perMileRate = .045;
		}
		else if(weight > 128) {
			perMileRate = .5;
		}
		double rate = distance * perMileRate; ;
	return rate;
	}
	


	//GETTERS/SETTERS//
	public String getName() {
		return name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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

	
}