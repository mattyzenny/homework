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
			 System.out.print("Your Fibonacci numbers are "+ value0 +" "+ value1);   
			    
			 for(int i=0;i <= newValue; ++i)    
			 {    
			 int finalOutput = value0 + value1; 
		
			 if(finalOutput<=newValue) {
			  System.out.print(" "+ finalOutput);    
			  value0 = value1;
				 value1 = finalOutput;
			 }    
			 else { break;
			}
	}
}
	}
}