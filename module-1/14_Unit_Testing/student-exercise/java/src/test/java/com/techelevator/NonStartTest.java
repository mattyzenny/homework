package com.techelevator;
import org.junit.*;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

	
	NonStart testSubString = new NonStart();
	
	
	
	@Test
	public void testRemoveFirstChar() {
		Assert.assertEquals("ark", testSubString.getPartialString("I", "Mark"));
		Assert.assertEquals("leaseelp", testSubString.getPartialString("Please", "Help"));
		Assert.assertEquals("eontneedno", testSubString.getPartialString("We", "Dontneedno"));
	Assert.assertEquals("ihere", testSubString.getPartialString("Hi", "There"));
	Assert.assertEquals("Bring the heat!", testSubString.getPartialString("hBring the heat!", "h"));

	}
//	@Test
//	public void testLenght1() {
//		Assert.assertEquals("here", testSubString.getPartialString("", "There"));
////		Assert.assertEquals("lease", testSubString.getPartialString("Please", ""));

	}


	
	

