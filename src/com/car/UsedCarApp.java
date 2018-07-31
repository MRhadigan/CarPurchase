package com.car;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//ArrayList named carsLot which refers to the CarClass. 
		ArrayList<CarClass> carsLot = new ArrayList<>();
		// Set perameters for each array of new cars
		CarClass n1 = new CarClass("0. Nikolai", "Model S", 2018, 54999.90);
		CarClass n2 = new CarClass("1. Fourd", "Escapade", 2018, 31999.90);
		CarClass n3 = new CarClass("2. Chewie", "Vette", 2018, 44989.95);
		// and used cars
		CarClass n4 = new UsedCar("3. Hyonda", "Prior", 2015, 14795.50, 35987.6);
		CarClass n5 = new UsedCar("4. GC", "Chirpus", 2013, 8500.00, 12345.0);
		CarClass n6 = new UsedCar("5. GC", "Witherell", 2016, 14450.00, 3500.3);
		
		carsLot.add(n1);
		carsLot.add(n2);
		carsLot.add(n3);
		carsLot.add(n4);
		carsLot.add(n5);
		carsLot.add(n6);
	
		String buy = "";
		int userCar;
		// displaying the ArrayList
		for(CarClass n : carsLot) {
			System.out.println(n);
		}
		// do while loop to ask if they would like to purchase a car
		do {
			//Getting input on which car 
			System.out.println();
			System.out.println("Please enter the number to a car you would like to buy! ");
			userCar = scan.nextInt();
			scan.nextLine();
			System.out.println(carsLot.get(userCar).getModel());
			System.out.println("Would you like to buy this car? (y/n)");
			buy = scan.nextLine();
	
			
		}	while (buy.equalsIgnoreCase("n"));
		// removing the Array from the list before printing it out
		carsLot.remove(userCar);
		System.out.println("Thank you for your purchase! Registered");
		// re=printing arrayList without the purchased item
		System.out.println();
		for(CarClass n: carsLot) {
			System.out.println(n);
		
		}
}
}