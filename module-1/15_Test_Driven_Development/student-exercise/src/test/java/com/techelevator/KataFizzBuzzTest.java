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
	Assert.assertEquals("Should test 'Fizz'", "Fizz", fizzybuzzy.Fizzbuzz((3)));

}
}
