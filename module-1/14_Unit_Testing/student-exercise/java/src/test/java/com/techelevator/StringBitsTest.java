package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

	
	StringBits everyOtherWord = new StringBits();
	
	
	
	@Test
	public void everyOtherTest() {
	Assert.assertEquals("Hlo", everyOtherWord.getBits("Hello"));
	Assert.assertEquals("H", everyOtherWord.getBits("He"));
	Assert.assertEquals("HiSteve", everyOtherWord.getBits("H i S t e v e"));
	Assert.assertEquals("", everyOtherWord.getBits(null));


}

}
