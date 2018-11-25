package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	private Employee employee;
	
	@Before
	public void Constructor() {
		employee = new Employee(007, "Ben", "Leder", 100000);	
	}
	
	@Test
	public void ShouldNotDecreaseSalary() {
		employee.RaiseSalary(-5);
		Assert.assertEquals("Expected 100000 but was: ", 100000.00, employee.getAnnualSalary(), 0.00);	
	}
	
	@Test
	public void ShouldIncreaseSalaryCorrectly() {
		employee.RaiseSalary(5);
		Assert.assertEquals("Expected true but was: ", 105000.00, employee.getAnnualSalary(), 0.00);	
	}

}
