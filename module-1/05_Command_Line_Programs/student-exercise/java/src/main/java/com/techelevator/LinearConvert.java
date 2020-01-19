package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
		boolean linearConversion = true;
		while(linearConversion) {
			System.out.println ("Congratulations on Completing your exercize for the day!");
			System.out.println ("Please enter the distance you traveled today :");
			String value = scanner.nextLine();
		
			 //how to put "if value != int//
//				System.out.println("please try again!");
//			}
			
			float distanceToConvert = Float.parseFloat(value);
			System.out.println("Please enter 'm' for meters or 'f' for feet: ");
			String distanceType = scanner.nextLine();
			
			
			if (distanceType.equalsIgnoreCase("m")) {
				float convertedDistance = distanceToConvert * (float) 3.2808399;
				System.out.println("your distance is " + distanceToConvert + " in meters" + "and " + convertedDistance + " in feet!");
			break; }
			else if (distanceType.equalsIgnoreCase("f")) {
				float convertedDistance = distanceToConvert * (float) 0.3048;
				System.out.println("your distance is " + distanceToConvert + "in feet" + "and " + convertedDistance + " in meters!");
			break; }
			else 
				System.out.println("Please try again");
		}
		}
	}
}

