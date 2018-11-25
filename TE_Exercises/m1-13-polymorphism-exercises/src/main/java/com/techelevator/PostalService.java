package com.techelevator;

public class PostalService implements DeliveryDriver {

	private double distance;
	private int weight;
	private boolean pounds;
	
	public PostalService() {
	}
	
	
	
	public double getDistance() {
		return distance;
	}



	public double getWeight() {
		return weight;
	}



	public boolean isPounds() {
		return pounds;
	}



	
	public double calculateRate(double distance, int weight) {
		return 0;
		
	}

}
