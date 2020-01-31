package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class Less20Test {

	Less20 newTest = new Less20();
	
	
	
	@Test
	public void TrueTest() {
		Assert.assertTrue(newTest.isLessThanMultipleOf20(20));
		Assert.assertTrue(newTest.isLessThanMultipleOf20(19));
		Assert.assertTrue(newTest.isLessThanMultipleOf20(18));
		Assert.assertTrue(newTest.isLessThanMultipleOf20(41));
		Assert.assertTrue(newTest.isLessThanMultipleOf20(22));

	
	}
	
	@Test
	public void FalseTest() {
		Assert.assertFalse(newTest.isLessThanMultipleOf20(0));
		Assert.assertFalse(newTest.isLessThanMultipleOf20(10));
		Assert.assertFalse(newTest.isLessThanMultipleOf20(35));
		Assert.assertFalse(newTest.isLessThanMultipleOf20(103));

}

}
	

