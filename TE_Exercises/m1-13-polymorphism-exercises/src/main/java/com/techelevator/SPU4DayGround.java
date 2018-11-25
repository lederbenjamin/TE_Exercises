package com.techelevator;

public class SPU4DayGround extends SPU{
	
	private double distance;
	private int weight;
	private boolean pounds;
	
	public SPU4DayGround(boolean pounds) {
		this.pounds = pounds;
	}
	
	
	
	public double getDistance() {
		return distance;
	}



	public double getWeight() {
		return weight;
	}
	
	@Override
	public double calculateRate(double distance, int weight) {
		this.distance = distance;
		this.weight = weight;
		double rate = 0;
		if (pounds == true) {
			rate = (weight * 0.0050) * distance;
		}
		else if (pounds == false) {
			rate = (weight * 0.0003125) * distance;
		}
		return rate;
	}

}
