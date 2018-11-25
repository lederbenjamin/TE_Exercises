package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please paste desired absolute file path including the file name 'FizzBuzz.txt' ");
		String path = scanner.nextLine();
		System.out.println("Program wil now execute. Please verify file");
		File newFile = new File(path); //change to your preferred directory
		
		try {
			newFile.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try (PrintWriter writer = new PrintWriter(newFile)) { // try with resources flushes your print writer for you
			
		String number;
			for(int i = 1; i <= 300; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				number = "FizzBuzz";
				writer.println(number);
			} else if ((i % 3 == 0) || Integer.toString(i).contains("3")) {
				number = "Fizz";
				writer.println(number);
			} else if ((i % 5 == 0) || Integer.toString(i).contains("5")) {
				number = "Buzz";
				writer.println(number);
			} else {
				number = Integer.toString(i);
				writer.println(number);
			}
			}
		}
	}
}
		