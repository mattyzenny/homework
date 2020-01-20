package com.techelevator;

import java.util.Scanner; 

public class Fibonacci {
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			 System.out.println("Hello & Welcome to Fibonacci's calculator");
			 System.out.print("Please enter your Fibonacci number: ");
			 String value = scanner.nextLine();
			 int newValue = Integer.parseInt(value);
			 int value0 =0;
			 int value1 =1;
			 int finalValue = newValue;   
			 System.out.print("Your Fibonacci numbers are "+ value0 +" "+ value1);   
			    
			 for(int i=2;i <= newValue; ++i)    
			 {    
			  finalValue = value0 + value1;    
			  System.out.print(" "+ finalValue);    
			  value0 = value1;    
			  value1 = finalValue;    
			 }    
			  
			}
	}
}