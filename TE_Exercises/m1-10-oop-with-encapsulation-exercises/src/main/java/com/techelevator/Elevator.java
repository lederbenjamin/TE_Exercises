package com.techelevator;

public class Elevator {
	
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	public Elevator(int totalNumberOffloors) {
		this.numberOfFloors = totalNumberOffloors;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}

	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) 
    {
        if ((desiredFloor > currentFloor) && (desiredFloor <= numberOfFloors) && (doorOpen == false))
        	currentFloor = desiredFloor;

    }
	
	public void goDown(int desiredFloor) 
    {
        if ((desiredFloor < currentFloor) && (desiredFloor > 0) && (doorOpen == false))
        	currentFloor = desiredFloor;
    }
}
