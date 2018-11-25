package com.techelevator;

import java.text.*;
import java.util.*;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner myScanner = new Scanner(System.in);
		System.out.println("$ java LinearConvert");
		System.out.println("Please enter the length: ");
		String length = myScanner.nextLine();
		double lengthDouble = Double.parseDouble(length);

		while (true) {
			System.out.println("Is the measurement in (m)eter, or (f)eet? ");
			String decider = myScanner.nextLine();
				if (decider.equalsIgnoreCase("m")) {
					double feet = lengthDouble * 3.2808399;
					System.out.println(lengthDouble + "m is " + df.format(feet) + "f.");
					break;
				}
				else if (decider.equalsIgnoreCase("f")) {
					double meter = lengthDouble * 0.3048;
					System.out.println(lengthDouble + "f is " + df.format(meter) + "m.");
					break;
			}
			else
				System.out.println("Pease enter 'm' or 'n' to designate measurment type.");
		}
	}
}
