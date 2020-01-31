package com.techelevator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;

public class CigarPartyTest {
 
	CigarParty newParty = new CigarParty();
	

	@Test
	public void minimumMaximumCigarCountTest() {
		
		Assert.assertTrue(newParty.haveParty(40, false));
		Assert.assertTrue(newParty.haveParty(40, true));
		Assert.assertTrue(newParty.haveParty(60, true));
		Assert.assertTrue(newParty.haveParty(60, false));
		Assert.assertTrue(newParty.haveParty(100, true));
	}

	}

	

