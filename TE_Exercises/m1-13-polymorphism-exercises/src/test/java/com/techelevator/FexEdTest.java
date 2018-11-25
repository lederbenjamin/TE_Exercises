package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class FexEdTest {

	@Test
	public void PoundsShouldApplyTwentyDollarRate() {
		FexEd fexed = new FexEd (true);
		Assert.assertEquals(20.00, fexed.calculateRate(499, 3));
	}
	
	@Test
	public void PoundsShouldApplyBothFees() {
		FexEd fexed = new FexEd (true);
		Assert.assertEquals(28.00, fexed.calculateRate(501, 4));
	}
	
	@Test
	public void PoundsShouldApplyOnlyMilesFee() {
		FexEd fexed = new FexEd (true);
		Assert.assertEquals(25.00, fexed.calculateRate(501, 3));
	}
	
	@Test
	public void PoundsShouldApplyOnlyWeightFee() {
		FexEd fexed = new FexEd (true);
		Assert.assertEquals(23.00, fexed.calculateRate(499, 4));
	}
	
	@Test
	public void OuncesShouldApplyTwentyDollarRate() {
		FexEd fexed = new FexEd (false);
		Assert.assertEquals(20.00, fexed.calculateRate(499, 48));
	}
	
	@Test
	public void OuncesShouldApplyBothFees() {
		FexEd fexed = new FexEd (false);
		Assert.assertEquals(28.00, fexed.calculateRate(501, 49));
	}
	
	@Test
	public void OuncesShouldApplyOnlyMilesFee() {
		FexEd fexed = new FexEd (false);
		Assert.assertEquals(25.00, fexed.calculateRate(501, 48));
	}
	
	@Test
	public void OuncesShouldApplyOnlyWeightFee() {
		FexEd fexed = new FexEd (false);
		Assert.assertEquals(23.00, fexed.calculateRate(499, 49));
	}
	
	

}
