package com.techelevator;

import java.util.Scanner;
import java.text.*;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner myScanner = new Scanner(System.in);
		System.out.println("$ java TempConvert");
		System.out.println("Please enter the temprature: ");
		String length = myScanner.nextLine();
		double tempDouble = Double.parseDouble(length);

		while (true) {
			System.out.println("Is the temperature in (C)elcius, or (F)arenheit? ");
			String decider = myScanner.nextLine();
				if (decider.equalsIgnoreCase("C")) {
					double farenheit = tempDouble * 1.8 + 32;
					System.out.println(tempDouble + "C is " + df.format(farenheit) + "F.");
					break;
				}
				else if (decider.equalsIgnoreCase("F")) {
					double celcius = (tempDouble - 32) / 1.8;
					System.out.println(tempDouble + "F is " + df.format(celcius) + "C.");
					break;
			}
			else
				System.out.println("Pease enter 'C' or 'F' to designate temp type.");
			}
		}
	}
