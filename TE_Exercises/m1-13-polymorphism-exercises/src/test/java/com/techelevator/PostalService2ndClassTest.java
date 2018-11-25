package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class PostalService2ndClassTest {

	
	@Test
	public void testPoundsSecondClassWorks() {
		PostalService2ndClass postalservice = new PostalService2ndClass (true);
		Assert.assertEquals(0.0195, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.0390, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.0450, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.0900, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.0500, postalservice.calculateRate(1, 9));
		Assert.assertEquals(0.1000, postalservice.calculateRate(2, 9));
	}
	
	
	@Test
	public void testOuncesSecondClassWorks() {
		PostalService2ndClass postalservice = new PostalService2ndClass (false);
		Assert.assertEquals(0.0035, postalservice.calculateRate(1, 1));
		Assert.assertEquals(0.0070, postalservice.calculateRate(2, 1));
		Assert.assertEquals(0.0040, postalservice.calculateRate(1, 4));
		Assert.assertEquals(0.0080, postalservice.calculateRate(2, 4));	
		Assert.assertEquals(0.0047, postalservice.calculateRate(1, 9));
		Assert.assertEquals(0.0094, postalservice.calculateRate(2, 9));
		
		Assert.assertEquals(0.0195, postalservice.calculateRate(1, 16));
		Assert.assertEquals(0.0390, postalservice.calculateRate(2, 16));
		Assert.assertEquals(0.0450, postalservice.calculateRate(1, 64));
		Assert.assertEquals(0.0900, postalservice.calculateRate(2, 64));	
		Assert.assertEquals(0.0500, postalservice.calculateRate(1, 144));
		Assert.assertEquals(0.1000, postalservice.calculateRate(2, 144));
	}
	

}
