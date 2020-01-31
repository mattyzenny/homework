package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

	
	SameFirstLast checkTest = new SameFirstLast();
	
	
	
	@Test
	public void testSameFirstLastTrue() {
		
		Assert.assertTrue(checkTest.isItTheSame(new int [] {3,1,3}));
		Assert.assertTrue(checkTest.isItTheSame(new int [] {0}));
		Assert.assertTrue(checkTest.isItTheSame(new int [] {1,1,1}));
	}

		@Test
		public void testSameFirstLastFalse() {
		Assert.assertFalse(checkTest.isItTheSame(new int [] {1,1,3}));
		Assert.assertFalse(checkTest.isItTheSame(new int [] {3,2}));
		Assert.assertFalse(checkTest.isItTheSame(new int [] {}));
		Assert.assertFalse(checkTest.isItTheSame(null));

	}
	

	
	
}
