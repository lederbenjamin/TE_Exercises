package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	private Television television;
	
	@Before
	public void Constructor() {
		television = new Television();
		television.TurnOn();
	}
	
	
	
	@Test
	public void ShouldNotExceedVolume10() {
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		television.RaiseVolume();
		Assert.assertEquals("Expected 10 but was: ", 10, television.getCurrentVolume());	
	}
	
	@Test
	public void ShouldNotGoBelowVolume0() {
		television.LowerVolume();
		television.LowerVolume();
		television.LowerVolume();
		Assert.assertEquals("Expected 0 but was: ", 0, television.getCurrentVolume());	
	}
	
	@Test
	public void ShouldResetVolumeTo2() {
		television.RaiseVolume();
		television.TurnOff();
		television.TurnOn();
		Assert.assertEquals("Expected 2 but was: ", 2, television.getCurrentVolume());	
	}
	
	@Test
	public void ShouldNotGoAboveChannel18() {
		television.ChangeChannel(19);
		Assert.assertEquals("Expected 3 but was: ", 3, television.getSelectedChannel());	
	}
	
	@Test
	public void ShouldNotGoBelowChannel3() {
		television.ChangeChannel(2);
		Assert.assertEquals("Expected 3 but was: ", 3, television.getSelectedChannel());	
	}

}
