package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CarTest {

	@Test
	public void ShouldCreatObject() {
		Car car = new Car(true);
		Assert.assertNotNull(car);
	}
	
	@Test
	public void ShouldReturnTrailerStatus() {
		Car car = new Car(true);
		Assert.assertEquals(true, car.isTrailer());
	}
	
	@Test
	public void TrailerShouldReturnCorrectToll() {
		Car car = new Car(true);
		Assert.assertEquals(3.00, car.calculateToll(100));
	}
	
	@Test
	public void NoTrailerShouldReturnCorrectToll() {
		Car car = new Car(false);
		Assert.assertEquals(2.00, car.calculateToll(100));
	}
	
	@Test
	public void ShouldReturn0For0OrNegativeDistances() {
		Car car = new Car(false);
		Assert.assertEquals(0.0, car.calculateToll(0));
		Assert.assertEquals(0.0, car.calculateToll(-100));
	}
	
	@Test
	public void ShouldReturnCorrectDistance() {
		Car car = new Car(false);
		car.calculateToll(100);
		Assert.assertEquals(100.0, car.getDistance());
	}
	

}
