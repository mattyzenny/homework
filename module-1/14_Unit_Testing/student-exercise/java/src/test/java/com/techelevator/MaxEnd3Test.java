package com.techelevator;
import static org.junit.Assert.assertArrayEquals;

import org.junit.*;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

	MaxEnd3 newArray = new MaxEnd3();
	
	
	@Test
	public void testPrint3Tests() {
		Assert.assertArrayEquals(new int[] {5,5,5}, newArray.makeArray(new int[] {3,4,5}));
		Assert.assertArrayEquals(new int[] {5,5,5}, newArray.makeArray(new int[] {5,10,0}));
		Assert.assertArrayEquals(new int[] {2,2,2}, newArray.makeArray(new int[] {2,1,0}));
		
	
	}
	


	
	
}
