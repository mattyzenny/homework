package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class Lucky13Test {

	
	Lucky13 arrayOfInts = new Lucky13();
	
	
	
	@Test
	public void no1or3Test() {
	Assert.assertEquals("check", true, arrayOfInts.getLucky(null));
	Assert.assertEquals("check", true, arrayOfInts.getLucky(new int[] {0,2,4}));
	Assert.assertEquals("check", false, arrayOfInts.getLucky(new int[] {1,2,4}));
	Assert.assertEquals("check", false, arrayOfInts.getLucky(new int[] {0,2,3}));
	Assert.assertEquals("check", false, arrayOfInts.getLucky(new int[] {0,3,4}));

	
}
}
