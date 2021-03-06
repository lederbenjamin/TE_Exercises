package com.techelevator;

import java.util.Scanner;

/*
 The Fibonacci numbers are the integers in the following sequence:  
	0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 By definition, the first two numbers in the Fibonacci sequence are 0 and 1, and each subsequent number is the sum of the previous two.
 
Write a command line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number.

  
 $ java Fiboncci
 
Please enter the Fibonacci number: 25
 
 0, 1, 1, 2, 3, 5, 8, 13, 21
 
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("$ java Fiboncci");
		System.out.println("Please enter the Fibonacci number: ");
		String input = myScanner.nextLine();
		int numInput = Integer.parseInt(input);
		if (numInput == 0) {
        	System.out.print("0");
		}
		
		int num1 = 0; 
		int num2 = 1;
		while (num1 < numInput) {
			if (numInput == 1) {
	        	System.out.print("0, 1");
	        	break;
			}
			
			System.out.print(num1+", ");
			int sumOfPrevTwo = num1 + num2;
			num1 = num2;
			num2 = sumOfPrevTwo;
			
		}
	}
}
