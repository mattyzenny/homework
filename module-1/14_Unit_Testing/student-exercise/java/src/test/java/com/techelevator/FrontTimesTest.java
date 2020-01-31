package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class FrontTimesTest {
	FrontTimes double3 = new FrontTimes();
	
	
	
	@Test
	public void Front3Over3Test(){
		Assert.assertEquals("Check", "ChoChoCho", double3.generateString("Chocolate", 3));
		Assert.assertEquals("Check", "BluBluBluBluBluBluBluBlu", double3.generateString("Blue", 8));
		Assert.assertEquals("Check", "Spe", double3.generateString("Speed", 1));
	}
	@Test
	public void Front3Unver3Test() {
		Assert.assertEquals("Check", "C", double3.generateString("C", 1));
		Assert.assertEquals("Check", "HoHoHoHoHoHoHoHoHoHo", double3.generateString("Ho", 10));
		Assert.assertEquals("Check", "BOOBOOBOO", double3.generateString("BOO", 3));
	}
	@Test
	public void EmptyandNegativeTest() {
		Assert.assertEquals("Check", "", double3.generateString(null, 3));
		Assert.assertEquals("Check", "", double3.generateString("Happy", -5));
		Assert.assertEquals("Check", "", double3.generateString("Speed", -1));
	}


	
	
	
	
}
