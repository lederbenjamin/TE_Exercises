package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter absolute file path for target file ");
		String pathForFile = scanner.nextLine();
		System.out.println("Please enter absolute file path for 'split' files to be created in ");
		String pathForSplits = scanner.nextLine();
		System.out.println("Please enter a whole number for the max number of lines for each file");
		String lineLimitAsString = scanner.nextLine();
		int lineLimit = Integer.parseInt(lineLimitAsString);
		System.out.println("Program wil now execute. Please verify files");
		File file = new File(pathForFile); // change to the document you wish to split
		int counter = 0;
			try (Scanner lineReader = new Scanner(file)) {
					while (lineReader.hasNextLine()) {
						counter++;
						File newFile = new File(pathForSplits + Integer.toString(counter)); //create directory for files
						newFile.createNewFile();
						try (PrintWriter writer = new PrintWriter(newFile)) {
							System.out.println("File " + counter + " has been created.");
							for(int i = 0; i < lineLimit; i++) {
								if(lineReader.hasNextLine()) {
									String line = lineReader.nextLine();
									writer.println(line);
								}
							}
						}
					}

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}