package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {
		int totalMiles = 0;
		double tollBoothRevenue = 0.00;
		
				
		Car car = new Car(false);
		Car carWithTrailer = new Car(true);
		Tank tank = new Tank();
		Truck truckWith4Axels = new Truck(4);
		Truck truckWith6Axles = new Truck(6);
		Truck truckWith8Axels = new Truck(8);
		
		List<IVehicleInterFace> myVehicleList = new ArrayList<IVehicleInterFace>();
		
		
		myVehicleList.add(car);
		myVehicleList.add(carWithTrailer);
		myVehicleList.add(tank);
		myVehicleList.add(truckWith4Axels);
		myVehicleList.add(truckWith6Axles);
		myVehicleList.add(truckWith8Axels);
		System.out.println(String.format("%-20s  %-20s  %-20s", "Vehicles", "Distance", "Toll"));
		System.out.println("========================================================");
		
//		for(IVehicleInterFace miles : myVehicleList) {
		for (IVehicleInterFace revenue : myVehicleList) {
			tollBoothRevenue +=  revenue.calculateToll(totalMiles);
			
		}
		System.out.println(tollBoothRevenue);
		
		System.out.println(car.getType() + car.getDistance() + "$ " + car.calculateToll(100));
		System.out.println(car.getType() + car.getDistance() + "$ " + carWithTrailer.calculateToll(75));
		System.out.println(tank.getType() + car.getDistance() + "$ " + tank.calculateToll(240));
		System.out.println("$ " + truckWith4Axels.calculateToll(150));
		System.out.println("$ " + truckWith6Axles.calculateToll(101));
		System.out.println("$ " + truckWith8Axels.calculateToll(180));


}
}
