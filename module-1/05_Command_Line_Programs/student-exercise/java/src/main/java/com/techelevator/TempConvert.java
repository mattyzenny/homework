package com.techelevator;

import java.util.Scanner;

public class TempConvert {
	
	public static void main(String[] args) {
try (Scanner scanner = new Scanner (System.in)) {
	boolean temperatureConversion = true;
	while (temperatureConversion) {
		System.out.println("Hello, please type any temperature");
		String value = scanner.nextLine();
		
		float temperatureInput = Float.parseFloat(value);
		
		System.out.println("Type 'f' for Fahrenheit or 'c' for Celcius");
		String typeToConvert = scanner.nextLine();
		if (typeToConvert.equalsIgnoreCase("f")) {
			float convertedTemperature = (temperatureInput - 32) / (float)1.8;
		System.out.println(temperatureInput + " degrees Fahrenheit is " + convertedTemperature + " Celcius" );
			break; }
	else if (typeToConvert.equalsIgnoreCase("c")) {
		float convertedTemperature = (float) temperatureInput * (float) 1.8 + 32 ;
		System.out.println(temperatureInput + " degrees Celcius is " + convertedTemperature + " Fahrenheit");
			break;}
	else {
	System.out.println("Error Jordan; please try again");
}
	}
}
	}
}



