package com.techelevator.calculator;

import java.util.*;

public class Calculator {

	private int currentValue =0;
	

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}

	public int add(int addend) {
		return currentValue += addend;
	}
	
	public int multiply(int multiplier) {
		return currentValue = currentValue * multiplier;
		
	}
	public int subtract(int subtrahend) {
		return currentValue -= subtrahend;
	}
	
	public int power(int exponent) {
		return (currentValue = (int) Math.pow(currentValue, exponent));
	}
	public void reset () {
		currentValue = 0;
	}
	
	public int getCurrentValue() {
		return currentValue;
	
}
}
