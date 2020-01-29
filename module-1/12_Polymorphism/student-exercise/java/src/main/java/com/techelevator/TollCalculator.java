package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

	public static void main(String[] args) {

		Car car = new Car(false, 100);
		Car carWithTrailer = new Car(true, 75);
		Tank tank = new Tank(240);
		Truck truckWith4Axels = new Truck(150, 4);
		Truck truckWith6Axles = new Truck(101, 6);
		Truck truckWith8Axels = new Truck(180, 8);
		List<IVehicleInterFace> myVehicleList = new ArrayList<IVehicleInterFace>();	
//		
		myVehicleList.add(car);		
		myVehicleList.add(carWithTrailer);
		myVehicleList.add(tank);
		myVehicleList.add(truckWith4Axels);
		myVehicleList.add(truckWith6Axles);
		myVehicleList.add(truckWith8Axels);
		System.out.println(String.format("%-20s  %-20s  %-20s", "Vehicles", "Distance", "Toll"));
		System.out.println("==================================================");

		
		
		
//		for(IVehicleInterFace miles : myVehicleList) {
		for (IVehicleInterFace vehicle : myVehicleList) {
			System.out.println(vehicle);
		}
//		for (IVehicleInterFace distance : myVehicleList) {
		
		int totalDistance = car.getDistance() + carWithTrailer.getDistance() + tank.getDistance() + truckWith4Axels.getDistance() + truckWith6Axles.getDistance() + truckWith8Axels.getDistance();

		System.out.println("==================================================");
		System.out.println("Total Distance :" + "          "   + "Total Cost:");
		System.out.println(totalDistance);
////			
//		
		
		


	}
}
