package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TruckTest {

	@Test
	public void ShouldCreatObject() {
		Truck truck = new Truck(4);
		Assert.assertNotNull(truck);
	}
	
	@Test
	public void ShouldReturnNumberOfAxles() {
		Truck truck = new Truck(4);
		Assert.assertEquals(4, truck.getAxles());
	}
	
	@Test
	public void ShouldReturnCorrectToll4Axles() {
		Truck truck = new Truck(4);
		Assert.assertEquals(4.00, truck.calculateToll(100));
	}
	
	@Test
	public void ShouldReturnCorrectToll6Axles() {
		Truck truck = new Truck(6);
		Assert.assertEquals(4.50, truck.calculateToll(100));
	}
	
	@Test
	public void ShouldReturnCorrectToll8OrMoreAxles() {
		Truck truck1 = new Truck(8);
		Truck truck2 = new Truck(10);
		Assert.assertEquals(4.80, truck1.calculateToll(100));
		Assert.assertEquals(4.80, truck2.calculateToll(100));


	}
	
	@Test
	public void ShouldReturnCorrectDistance() {
		Truck truck = new Truck(6);
		truck.calculateToll(100);
		Assert.assertEquals(100.0, truck.getDistance());
	}

}
