package com.techelevator;

public class Television {

	//DATA ATTRIBUTES//
	
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;

	
	
	
	//CONSTRUCTOR//
	//set in default//
	
	
	
	
	//METHODS//
	public void turnOff() {
		isOn = false;
	}
	public void turnOn () {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) {
		while(isOn == true) {
			if (newChannel >= 3 && newChannel <= 18) {
				currentChannel = newChannel;
			}
		break;
		}
	}
	public void channelUp() {
		while (isOn == true) {
			if (currentChannel >= 3 && currentChannel <= 18) {
				currentChannel ++;
			}
			if (currentChannel > 18) {
				currentChannel = 3;
			}
	break;
	}
	}
	public void channelDown() {
		while(isOn == true) {
			if (currentChannel >= 3 && currentChannel <= 18) {
				currentChannel = currentChannel - 1;
			}
			if (currentChannel < 3) {
				currentChannel = 18;
			}
	break;
		}
	}
	
	public void raiseVolume() {
		while(isOn == true) {
			if(currentVolume <= 10) {
				currentVolume = currentVolume +1;
			}
		break;
		}
	}
	public 	void lowerVolume() {
		while(isOn == true) {
			if (currentVolume > 0) {
				currentVolume = currentVolume -1;
			}
		break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//GETTERS//
	public boolean isOn() {
		return isOn;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
	
	
	
	
}
