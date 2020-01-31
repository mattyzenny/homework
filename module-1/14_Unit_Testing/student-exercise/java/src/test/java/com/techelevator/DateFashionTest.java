package com.techelevator;
import org.junit.*;


public class DateFashionTest {

	DateFashion happyCouple = new DateFashion();
	
	
	@Test
	public void stylishYouTest() {
		Assert.assertEquals(2, happyCouple.getATable(10, 10));
		Assert.assertEquals(2, happyCouple.getATable(10, 3));
		Assert.assertEquals(2, happyCouple.getATable(8, 3));

	}
	@Test
	public void stylishDateTest() {
		Assert.assertEquals(2, happyCouple.getATable(3, 10));
		Assert.assertEquals(2, happyCouple.getATable(3, 8));
		Assert.assertEquals(2, happyCouple.getATable(10, 10));

	}
	@Test
	public void maybeDinnerTest() {
		Assert.assertEquals(1, happyCouple.getATable(3, 3));
		Assert.assertEquals(1, happyCouple.getATable(3, 7));
		Assert.assertEquals(1, happyCouple.getATable(7, 3));
	}
	@Test
	public void noDinnerTest() {
		Assert.assertEquals(0, happyCouple.getATable(2, 2));
		Assert.assertEquals(0, happyCouple.getATable(10, 1));
		Assert.assertEquals(0, happyCouple.getATable(0, 3));
		Assert.assertEquals(0, happyCouple.getATable(0, 0));

}
}
