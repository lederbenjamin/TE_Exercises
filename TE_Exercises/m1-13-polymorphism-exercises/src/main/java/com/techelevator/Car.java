package com.techelevator;

public class Car implements Vehicle {
	
	private boolean trailer;
	private double distance;
	
	
	public Car (boolean trailer) {
		this.trailer = trailer;
	}
	
	

	public boolean isTrailer() {
		return trailer;
	}



	public double getDistance() {
		return distance;
	}



	@Override
	public double calculateToll(double distance) {
		double toll = 0;
		if (distance > 0) {
			this.distance = distance;
			if (trailer == true) {
				toll = distance * 0.020;
				toll += 1.00;
			}
			else if (trailer == false) {
				toll = distance * 0.020;
			}
		}
		return toll;
	}

}
