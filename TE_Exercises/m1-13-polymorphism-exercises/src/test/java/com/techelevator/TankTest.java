package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TankTest {

	@Test
	public void ShouldCreatObject() {
		Tank tank = new Tank();
		Assert.assertNotNull(tank);
	}
	
	
	@Test
	public void ShouldReturnCorrectToll() {
		Tank tank = new Tank();
		Assert.assertEquals(0.0, tank.calculateToll(100));
	}
	
	@Test
	public void ShouldReturnCorrectDistance() {
		Tank tank = new Tank();
		tank.calculateToll(100);
		Assert.assertEquals(100.0, tank.getDistance());
	}

}
