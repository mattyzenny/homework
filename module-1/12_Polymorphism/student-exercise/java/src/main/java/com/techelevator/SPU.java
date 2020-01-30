package com.techelevator;

public class SPU  implements IDeliveryDriverInterface {
	
	
	//ATTRIBUTES///
	private int mailDelivery;
	private int distanceInMiles;
	private double weightInOunces;
	private double rate;
	private int mailClass;
	private double weightInPounds;
	

	//CONSTRUCTOR//

	
	//METHODS///
	

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateRate(int distance, double weight) {
		double rate = 0.0;
		double weightInPounds = (double) weightInOunces / 16;
		if(mailClass == 1) {
			rate = .075;
		}
		else if (mailDelivery == 2) {
			rate = .050;
		}
		else {
			rate = .0050;
		}
	return weightInPounds *  rate * distance;
}

	
	//GETTERS SETTERS//
	
	public int getDistanceInMiles() {
		return distanceInMiles;
	}

	public void setDistanceInMiles(int distanceInMiles) {
		this.distanceInMiles = distanceInMiles;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(int weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
	public int getMailDelivery() {
		return mailDelivery;
	}

	public void setMailDelivery(int mailDelivery) {
		this.mailDelivery = mailDelivery;
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
	
	
	
	public int getMailClass() {
		return mailClass;
	}

	public void setMailClass(int mailClass) {
		this.mailClass = mailClass;
	}
	
	

	
	
	
}
