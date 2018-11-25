package com.techelevator;

public class Tank implements Vehicle {
	
	private double distance;
	
	public Tank() {
		
	}
	
	

	public double getDistance() {
		return distance;
	}


	@Override
	public double calculateToll(double distance) {
		this.distance = distance;

		return 0;
	}

}
