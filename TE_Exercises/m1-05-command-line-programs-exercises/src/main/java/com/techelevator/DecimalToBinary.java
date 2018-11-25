package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("$ DecimalToBinary");
		System.out.println("Please enter in a series of decimal values (separated by spaces): ");
		String numbersAsString = scan.nextLine();
		String[] numbersAsStringArray = numbersAsString.split(" ");
		int[] numbersAsIntArray = new int [numbersAsStringArray.length];
		
		for (int i = 0; i < numbersAsStringArray.length; i++) {
			numbersAsIntArray[i] = Integer.parseInt(numbersAsStringArray[i]);
		}
		
		String binary = "";
		for(int i = 0; i < numbersAsIntArray.length; i++) {
			while(numbersAsIntArray[i] > 0) {
				binary = numbersAsIntArray[i] % 2 + binary;
				numbersAsIntArray[i] = numbersAsIntArray[i] / 2;
			}
			System.out.println(numbersAsIntArray[i] + "in binary is " + binary);
			binary = "";
		}
	}
	}
