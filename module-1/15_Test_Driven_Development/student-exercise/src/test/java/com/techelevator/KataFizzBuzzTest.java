package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

	

public class KataFizzBuzzTest {
	
	KataFizzBuzz fizzybuzzy = new KataFizzBuzz();
	
	@Before
	public void testStart() {
		
	}
	
	@Test
	public void testDivisibleBy3() {
	Assert.assertEquals("Should test null", null, fizzybuzzy.Fizzbuzz(0));
	Assert.assertEquals("should test Fizz", "Fizz", fizzybuzzy.Fizzbuzz(3));
}
}



//once test is passing add and commit the code with the message "add passing code for test method" result_should_be_fizz_when_number_3
