package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class AirplaneTest {
	
	private Airplane airplane;
	
	@Before
	public void constructor() {
		airplane = new Airplane(10, 30);
	}

	@Test
	public void ShouldBookExactAmountOfSeatsFirstClass() {
		Assert.assertEquals("Expected true but was: ", true, airplane.Reserve(true, 10));	
	}
	
	@Test
	public void ShouldNotOverBookFirstClass() {
		Assert.assertEquals("Expected false but was: ", false, airplane.Reserve(true, 11));	
	}
	
	@Test
	public void ShouldBookExactAmountOfSeatsCoach() {
		Assert.assertEquals("Expected true but was: ", true, airplane.Reserve(false, 30));	
	}
	
	@Test
	public void ShouldNotOverBookCoach() {
		Assert.assertEquals("Expected false but was: ", false, airplane.Reserve(false, 31));	
	}
	
	@Test
	public void ShouldReturnAccurateAvailableFirstClassSeats() {
		airplane.Reserve(true, 5);
		Assert.assertEquals("Expected true but was: ", 5, airplane.getAvailableFirstClassSeats());	
	}
	
	@Test
	public void ShouldReturnAccurateAvailableCoachSeats() {
		airplane.Reserve(false, 20);
		Assert.assertEquals("Expected false but was: ", 10, airplane.getAvailableCoachSeats());	
	}

}
