package com.techelevator;

public class SPU implements DeliveryDriver {

	private double distance;
	private int weight;
	
	public SPU() {
	}
	
	
	
	public double getDistance() {
		return distance;
	}



	public double getWeight() {
		return weight;
	}
	
	@Override
	public double calculateRate(double distance, int weight) {
			return 0;
	}

}
