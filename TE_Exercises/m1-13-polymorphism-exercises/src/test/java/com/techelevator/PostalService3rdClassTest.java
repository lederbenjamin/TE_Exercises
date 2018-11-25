package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PostalService3rdClassTest {

	
	@Test
	public void testPoundsThirdClassWorks() {
		PostalService3rdClass postalservice = new PostalService3rdClass (true);
		Assert.assertEquals(0.0150, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.0300, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.0160, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.0320, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.0170, postalservice.calculateRate(1, 9));
		Assert.assertEquals(0.0340, postalservice.calculateRate(2, 9));
	}
	
	@Test
	public void testOuncesThirdClassWorks() {
		PostalService3rdClass postalservice = new PostalService3rdClass (false);
		Assert.assertEquals(0.0020, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.0040, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.0022, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.0044, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.0024, postalservice.calculateRate(1, 9));
		Assert.assertEquals(0.0048, postalservice.calculateRate(2, 9));
		
		Assert.assertEquals(0.0150, postalservice.calculateRate(1, 16));
		Assert.assertEquals(0.0300, postalservice.calculateRate(2, 16));
		Assert.assertEquals(0.0160, postalservice.calculateRate(1, 64));
		Assert.assertEquals(0.0320, postalservice.calculateRate(2, 64));	
		Assert.assertEquals(0.0170, postalservice.calculateRate(1, 144));
		Assert.assertEquals(0.0340, postalservice.calculateRate(2, 144));
	}

}
