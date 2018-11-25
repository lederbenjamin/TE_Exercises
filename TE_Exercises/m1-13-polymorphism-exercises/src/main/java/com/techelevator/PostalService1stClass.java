package com.techelevator;

public class PostalService1stClass extends PostalService{

	private double distance;
	private int weight;
	private boolean pounds;
	
	public PostalService1stClass(boolean pounds) {
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
				rate = 0.195d;
			else if (weight >= 4 && weight <= 8 ) 
				rate = 0.450d;
			else
				rate = 0.500d;
		}
		else if (pounds == false) 
		{
			if (weight >= 0 && weight <= 2 )
				rate = 0.035d;
			else if (weight >= 3 && weight <= 8 ) 
				rate = 0.040d;
			else if (weight >= 9 && weight <= 15 ) 
				rate = 0.047d;
			else if (weight >= 16 && weight <= 48 ) 
				rate = 0.195d;
			else if (weight >= 49 && weight <= 128 ) 
				rate = 0.450d;
			else 
				rate = 0.500d;
		}
		return rate * distance;	
	}
}
