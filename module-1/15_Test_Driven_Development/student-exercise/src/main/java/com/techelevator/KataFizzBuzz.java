package com.techelevator;

public class KataFizzBuzz {

	public String Fizzbuzz (int n) {
		String a = String.valueOf(n);
		if (n == 0 || n%5 != 0 && n%3 != 0) {
		return a;
		}
		else if(n!=0 && n%5==0 && n%3 ==0) {
			return "FizzBuzz";
		}
		else if(n!=0 && n%3==0) {
			return "Fizz";
		}
		else if(n!=0 && n%5==0) {	
			return "Buzz";
		}
		return null;
}
}
