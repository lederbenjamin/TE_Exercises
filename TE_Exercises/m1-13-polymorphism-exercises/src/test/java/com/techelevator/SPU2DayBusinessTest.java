package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SPU2DayBusinessTest {

	@Test
	public void PoundsShouldApply1DaayRate() {
		SPU2DayBusiness spu = new SPU2DayBusiness (true);
		Assert.assertEquals(1.5, spu.calculateRate(10, 3));
	}
	
	@Test
	public void OuncesShouldApply1DaayRate() {
		SPU2DayBusiness spu = new SPU2DayBusiness (false);
		Assert.assertEquals(1.5, spu.calculateRate(10, 48));
	}

	//1.5 on my calculator at home. Why is Java reporting 1.500000000000000000002
}