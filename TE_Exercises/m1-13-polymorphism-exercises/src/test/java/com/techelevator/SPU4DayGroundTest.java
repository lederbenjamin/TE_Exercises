package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SPU4DayGroundTest {

	@Test
	public void PoundsShouldApply1DaayRate() {
		SPU4DayGround spu = new SPU4DayGround (true);
		Assert.assertEquals(0.15, spu.calculateRate(10, 3));
	}
	
	@Test
	public void OuncesShouldApply1DaayRate() {
		SPU4DayGround spu = new SPU4DayGround (false);
		Assert.assertEquals(0.15, spu.calculateRate(10, 48));
	}

}
