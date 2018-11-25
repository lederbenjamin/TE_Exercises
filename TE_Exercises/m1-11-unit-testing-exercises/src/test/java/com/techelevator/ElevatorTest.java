package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {

private Elevator elevator;
	
	@Before
	public void Constructor() {
		elevator = new Elevator( 2, 10);
	}
	
	
	
	@Test
	public void ShouldNotGoThroughTheCeiling() {
		elevator.OpenDoor();
		elevator.CloseDoor();
		Assert.assertEquals("Expected false but was: ", false, elevator.GoUp(11));	
	}
	
	@Test
	public void ShouldNotGoBelowFloor1() {
		elevator.OpenDoor();
		elevator.CloseDoor();
		Assert.assertEquals("Expected false but was: ", false, elevator.GoDown(0));	
	}
	
	@Test
	public void ShouldNotMoveWhileDoorOpen() {
		elevator.OpenDoor();
		Assert.assertEquals("Expected false but was: ", false, elevator.GoDown(5));	
	}

}
