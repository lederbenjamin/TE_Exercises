package com.techelevator.projects.view;

import static org.junit.Assert.*;


import org.junit.Test;

public class KataTest {

	@Test
	public void swapEndsTest() {
		int[] passed = new int[] {4, 2, 3, 1};
		int[] expected = new int[] {1, 2, 3, 4};

		assertEquals(expected, Kata.swapEnds(passed));
	}
	
	@Test
	public void greenTicketTest() {
		int[] passed = new int[] {2, 2, 2};
		int expected = 20;

		assertEquals(expected, Kata.greenTicket(passed));
	}

}
