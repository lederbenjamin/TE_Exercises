package com.techelevator;

public class FexEd implements DeliveryDriver {
	
	private double distance;
	private int weight;
	private boolean pounds;
	
	public FexEd(boolean pounds) {
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
		double rate = 20.00;
		if (pounds == true) {
			if (distance > 500 && weight > 3 )
				rate += 8.00;
			else if (distance > 500)
				rate += 5.00;
			else if (weight > 3)
				rate += 3.00;
		}
		else if (pounds == false) {
			if (distance > 500 && weight > 48 )
				rate += 8.00;
			else if (distance > 500)
				rate += 5.00;
			else if (weight > 48)
				rate += 3.00;
		} 
		return rate;
	}
}

