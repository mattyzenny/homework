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
	Assert.assertEquals("should test Fizz", "Fizz", fizzybuzzy.Fizzbuzz(33));
	Assert.assertEquals("should test Fizz", "Fizz", fizzybuzzy.Fizzbuzz(3));
}
	@Test
	public void testDivisibleBy5() {
		Assert.assertEquals("Should test buzz", "Buzz", fizzybuzzy.Fizzbuzz(5));
		Assert.assertEquals("Should test buzz", "Buzz", fizzybuzzy.Fizzbuzz(100));

	}
	@Test
	public void testDivisibleBy5And3() {
		Assert.assertEquals("Should test fizzbuzz", "FizzBuzz", fizzybuzzy.Fizzbuzz(15));
		Assert.assertEquals("Should test fizzbuzz", "FizzBuzz", fizzybuzzy.Fizzbuzz(30));
		Assert.assertEquals("Should test fizzbuzz", "FizzBuzz", fizzybuzzy.Fizzbuzz(45));

	}
	@Test
	public void testNotDivisibleBy5or3() {
		Assert.assertEquals("Should test convert", "11", fizzybuzzy.Fizzbuzz(11));
		Assert.assertEquals("Should test convert", "1", fizzybuzzy.Fizzbuzz(1));
		Assert.assertEquals("Should test convert", "98", fizzybuzzy.Fizzbuzz(98));

}
}

//Add test method, result should be X when X"
//"add passing code for test method" result_should_be_fizz_when_number_3
