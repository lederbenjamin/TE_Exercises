package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {

	private SmartPhone iphone;
	
	@Before
	public void Constructor() {
		iphone = new SmartPhone( "0123456789", "Verizon");
	}
	
	
	
	@Test
	public void ShouldRechargePhoneTo100() {
		iphone.Call("9876543210", 100);
		iphone.RechargeBattery();
		Assert.assertEquals("Expected 100 but was: ", 100, iphone.getBatteryCharge());	
	}
	
	@Test
	public void ShouldNotPlaceCallIfMinutesGreaterThanBatteryCharge() {
		Assert.assertEquals("Expected false but was: ", false, iphone.Call("9876543210", 101));	
	}
	
	@Test
	public void ShouldNotPlaceCallIfNumberNotLength10() {
		Assert.assertEquals("Expected false but was: ", false, iphone.Call("6543210", 101));	
	}

}
