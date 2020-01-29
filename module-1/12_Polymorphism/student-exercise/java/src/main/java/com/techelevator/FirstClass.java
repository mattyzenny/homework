package com.techelevator;

public class FirstClass implements IDeliveryDriverInterface {

	
	//ATTRIBUTES//
	private String name;

	@Override
	public String name() {
	
		return this.name;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double perMileRate = 0;
		double rate = distance * perMileRate;
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
		return rate;
	}

	
	//GETTERS/SETTERS//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
