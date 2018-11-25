package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DaysOfCodeTest {

	@Test
	public void test() {
		DaysOfCode testObject = new DaysOfCode();
		Assert.assertArrayEquals(new int[] {4, 3, 2, 1}, testObject.reverse(new int[] {1, 2, 3, 4}));
	}

}
