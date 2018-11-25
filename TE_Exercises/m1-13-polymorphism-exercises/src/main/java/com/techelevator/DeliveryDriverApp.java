package com.techelevator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DeliveryDriverApp {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.##");
		Scanner myScanner = new Scanner(System.in);
		System.out.println("---Delivery Driver App---");
		System.out.println("Please enter the weight of the package: ");
		String input1 = myScanner.nextLine();
		int weight = Integer.parseInt(input1);
		System.out.println("Please enter 'true' for pounds or 'false' for ounces: ");
		String input2 = myScanner.nextLine();
		boolean pounds = Boolean.parseBoolean(input2);
		System.out.println("Please enter the travel distance: ");
		String input3 = myScanner.nextLine();
		double distance = Double.parseDouble(input3);
		
		DecimalFormat formater = new DecimalFormat("0.00");

		
		DeliveryDriver ps1 = new PostalService1stClass(pounds);
		DeliveryDriver ps2 = new PostalService2ndClass(pounds);
		DeliveryDriver ps3 = new PostalService3rdClass(pounds);
		DeliveryDriver fexed = new FexEd(pounds);
		DeliveryDriver spu4 = new SPU4DayGround(pounds);
		DeliveryDriver spu2 = new SPU2DayBusiness(pounds);
		DeliveryDriver spu1 = new SPUNextDay(pounds);
					
		String deliveryMethod = "Delivery Method";
		String cost = "$ cost";
					
		System.out.println(String.format("%-30s %s" , deliveryMethod, cost));
		System.out.println("-------------------------------------");
		
		System.out.printf("Postal Service (1st Class)     $%s \n", formater.format(ps1.calculateRate(distance, weight)));
		System.out.printf("Postal Service (2nd Class)     $%s \n", formater.format(ps2.calculateRate(distance, weight)));
		System.out.printf("Postal Service (3rd Class)     $%s \n", formater.format(ps3.calculateRate(distance, weight)));
		System.out.printf("FexEd                          $%s \n", formater.format(fexed.calculateRate(distance, weight)));
		System.out.printf("SPU (4-day ground)             $%s \n", formater.format(spu4.calculateRate(distance, weight)));
		System.out.printf("SPU (2-day ground)             $%s \n", formater.format(spu2.calculateRate(distance, weight)));
		System.out.printf("SPU (next day)                 $%s \n", formater.format(spu1.calculateRate(distance, weight)));

	}

}
