package com.techelevator;

import java.text.DecimalFormat;
import java.util.Random;

public class TollBoothApp {

	public static void main(String[] args) {
		System.out.println("---Toll Booth App---");
		
		DecimalFormat formater = new DecimalFormat("0.00");
		
		Car carNoTrailer = new Car(false);
		Car carWithTrailer = new Car(true);
		Truck truck4axel = new Truck(4);
		Truck truck6axel = new Truck(6);
		Truck truck8axel = new Truck(8);
		Tank tank = new Tank ();
		
					
		String vehicle = "Vehicle";
		String distanceTraveled = "Distance Traveled";
		String tollEachVehicle = "Toll $";
					
		System.out.println(String.format("%-10s %-10s %s" , vehicle, tollEachVehicle, distanceTraveled));
		System.out.println("----------------------------------------");
		
		System.out.printf("Car        $%-15s %s\n", formater.format(carNoTrailer.calculateToll(Math.random()*100)), formater.format(carNoTrailer.getDistance()));
		System.out.printf("Car        $%-15s %s \n", formater.format(carWithTrailer.calculateToll(Math.random()*100)), formater.format(carWithTrailer.getDistance()));
		System.out.printf("Truck      $%-15s %s \n", formater.format(truck4axel.calculateToll(Math.random()*100)), formater.format(truck4axel.getDistance()));
		System.out.printf("Truck      $%-15s %s \n", formater.format(truck6axel.calculateToll(Math.random()*100)), formater.format(truck6axel.getDistance()));
		System.out.printf("Truck      $%-15s %s \n", formater.format(truck8axel.calculateToll(Math.random()*100)), formater.format(truck8axel.getDistance()));
		System.out.printf("Tank       $%-15s %s \n", formater.format(tank.calculateToll(Math.random()*100)), formater.format(tank.getDistance()));


	}

}
