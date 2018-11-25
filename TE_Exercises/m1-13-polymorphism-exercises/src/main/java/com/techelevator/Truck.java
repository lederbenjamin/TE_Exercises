package com.techelevator;

public class Truck implements Vehicle {
	
	private int axles;
	private double distance;
	
	public Truck (int axles){
		this.axles = axles;
	}
	
	
	
	public int getAxles() {
		return axles;
	}



	public double getDistance() {
		return distance;
	}



	@Override
	public double calculateToll(double distance) {
		this.distance = distance;
		double toll = 0;
		
		if (axles == 4) 
			toll = 0.040 * distance;
		else if (axles == 6)
			toll = 0.045 * distance;
		else if (axles >= 8)
			toll = 0.048 * distance;
		return toll;
	}

}
