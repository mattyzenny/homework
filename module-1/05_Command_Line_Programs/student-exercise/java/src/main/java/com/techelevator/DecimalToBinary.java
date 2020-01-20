package com.techelevator;
import java.util.Scanner;



public class DecimalToBinary {


	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter in a series of decimal values (separated by spaces): ");
			String input = scanner.nextLine();
		int finalFormat = Integer.parseInt(input);
		if( finalFormat < 0) {
			System.out.println("Please enter positive integer");
		}
		int binary = finalFormat;
		 {
			while(finalFormat > 0) {
				binary = (finalFormat%2) + binary;
				finalFormat = finalFormat/2;
				
			}
		System.out.println("binary is:" + binary);
		}
		}
	}
}
