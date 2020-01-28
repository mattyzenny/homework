package com.techelevator;

public class Elevator {
//	public static void main(String[] args) {
//		Integer i = new Integer(2345);
//		
//		System.out.println(i / 2);
//		
//		System.out.println(i.intValue() / 2);
//	}

	
	//VARIABLE DATA ATTRIBUTES//
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	
	
	
	//CONSTRUCTOR//
	public Elevator (int totalNumberOfFloors) {
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	
	//METHOD//
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	public void goUp(int desiredFloor) {
		while(doorOpen != true) {
			if((desiredFloor <= numberOfFloors) && (desiredFloor > currentFloor)) {
				currentFloor = desiredFloor;
			}
		break;
		}
		}

	
	public void goDown(int desiredFloor) {
		while(doorOpen != true) {
			if((desiredFloor >= 1) && (desiredFloor < currentFloor)) {
				currentFloor = desiredFloor;
			}
		break;
		}
		
	}
	
	
	
	
	
	//GETTERS//
	
	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}


}




	



