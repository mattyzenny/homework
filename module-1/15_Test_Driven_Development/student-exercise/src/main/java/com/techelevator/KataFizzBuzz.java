package com.techelevator;

public class KataFizzBuzz {

	public String Fizzbuzz (int n) {
		String a = String.valueOf(n);
		if (n < 1 || n > 100) {
			return "";
		}
		if (n%5 != 0 && n%3 != 0) {
		a = String.valueOf(n);
		return a;
		}
		if(n%5==0 && n%3 ==0) {
			return "FizzBuzz";
		}
		else if(n%3==0) {
			return "Fizz";
		}
		else 
			return "Buzz";
	
	}
}
