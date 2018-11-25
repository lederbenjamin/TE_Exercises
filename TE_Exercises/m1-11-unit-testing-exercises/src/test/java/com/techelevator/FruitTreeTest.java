package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;
import org.junit.Before;

public class FruitTreeTest {

	private FruitTree tree;
	
	@Before
	public void Constructor() {
		tree = new FruitTree("peaches", 10);	
	}
	
	
	
	@Test
	public void ShouldNotPickNegativeFruit() {
		Assert.assertEquals("Expected true but was: ", false, tree.PickFruit(-1));	
	}
	
	@Test
	public void ShouldPickAllTheFruit() {
		Assert.assertEquals("Expected true but was: ", true, tree.PickFruit(10));	
	}
	
	@Test
	public void ShouldPLeaveLastFruit() {
		Assert.assertEquals("Expected true but was: ", true, tree.PickFruit(9));	
	}
	
	@Test
	public void ShouldNotPickExtraFruit() {
		Assert.assertEquals("Expected true but was: ", false, tree.PickFruit(11));	
	}

}
