package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}

	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		return availableFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getAvailableCoachSeats() {
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		return availableCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		if (forFirstClass) {
			if((bookedFirstClassSeats + totalNumberOfSeats) <= totalFirstClassSeats) {
				bookedFirstClassSeats += totalNumberOfSeats;
				return true;
			}
			else 
				return false;
		}
		else {
			if((bookedCoachSeats + totalNumberOfSeats) <= totalCoachSeats){
				bookedCoachSeats += totalNumberOfSeats;
				return true;
			}
			else
				return false;
		}
	}	

}
