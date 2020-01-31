package com.techelevator;
import org.junit.*;



public class AnimalGroupNameTest {

	AnimalGroupName animal = new AnimalGroupName();
	
	
	
	@Test
	public void testAnimalName() {
		Assert.assertEquals("Crash", animal.getHerd("Rhino"));
		Assert.assertEquals("Kit", animal.getHerd("pigEON"));
		Assert.assertEquals("Pack", animal.getHerd("DOG"));
		Assert.assertEquals("Float", animal.getHerd("crocodilE"));
	
	
	}
	
	@Test
	public void testAnimalNullNotFoundEmpty() {
		Assert.assertEquals("unknown", animal.getHerd("Donkey"));
		Assert.assertEquals("unknown", animal.getHerd(null));
		Assert.assertEquals("this should be unknown", "unknown", animal.getHerd(""));
	
}
}
