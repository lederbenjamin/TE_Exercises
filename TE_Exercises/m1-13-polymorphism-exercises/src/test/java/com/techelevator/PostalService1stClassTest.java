package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PostalService1stClassTest {

	@Test
	public void testPoundsFirstClassWorks() {
		PostalService1stClass postalservice = new PostalService1stClass (true);
		Assert.assertEquals(0.195, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.390, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.450, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.900, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.500, postalservice.calculateRate(1, 9));
		Assert.assertEquals(1.000, postalservice.calculateRate(2, 9));

	}
	
	
	@Test
	public void testOuncesFirstClassWorks() {
		PostalService1stClass postalservice = new PostalService1stClass (false);
		Assert.assertEquals(0.035, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.070, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.040, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.080, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.047, postalservice.calculateRate(1, 9));
		Assert.assertEquals(0.094, postalservice.calculateRate(2, 9));

		Assert.assertEquals(0.195, postalservice.calculateRate(1, 16));
		Assert.assertEquals(0.390, postalservice.calculateRate(2, 16));
		Assert.assertEquals(0.450, postalservice.calculateRate(1, 64));
		Assert.assertEquals(0.900, postalservice.calculateRate(2, 64));	
		Assert.assertEquals(0.500, postalservice.calculateRate(1, 144));
		Assert.assertEquals(1.000, postalservice.calculateRate(2, 144));
	}

}
