package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class SPUNextDayTest {

	@Test
	public void PoundsShouldApply1DaayRate() {
		SPUNextDay spu = new SPUNextDay (true);
		Assert.assertEquals(2.25, spu.calculateRate(10, 3));
	}
	
	@Test
	public void OuncesShouldApply1DaayRate() {
		SPUNextDay spu = new SPUNextDay (false);
		Assert.assertEquals(2.25, spu.calculateRate(10, 48));
	}

}
