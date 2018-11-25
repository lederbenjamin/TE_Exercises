package com.techelevator;

public class PostalService3rdClass  extends PostalService{

	private double distance;
	private int weight;
	private boolean pounds;
	
	public PostalService3rdClass(boolean pounds) {
		this.pounds = pounds;
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



	@Override
	public double calculateRate(double distance, int weight) {
		double rate = 0;
		this.distance = distance;
		this.weight = weight;
		if (pounds == true) 
		{
			if (weight >= 1 && weight <= 3 )
				rate = 0.0150d;
			else if (weight >= 4 && weight <= 8 ) 
				rate = 0.0160d;
			else
				rate = 0.0170d;
		}
		else if (pounds == false) 
		{
			if (weight >= 0 && weight <= 2 )
				rate = 0.0020d;
			else if (weight >= 3 && weight <= 8 ) 
				rate = 0.0022d;
			else if (weight >= 9 && weight <= 15 ) 
				rate = 0.0024d;
			else if (weight >= 16 && weight <= 48 ) 
				rate = 0.0150d;
			else if (weight >= 49 && weight <= 128 ) 
				rate = 0.0160d;
			else 
				rate = 0.0170d;
		}
		return rate * distance;	
	}
}
