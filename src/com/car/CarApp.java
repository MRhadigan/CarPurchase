package com.car;

import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		CarClass c = new CarClass("Ford", "Taurus", 2005, 5000);
		
		
		
		ArrayList<CarClass> cars = new ArrayList<>();
		System.out.println("How many cars do you want to enter?");
		int userNum = scan.nextInt();
		scan.nextLine();
		
		String make;
		String model;
		int year;
		double price;
		
		for (int i = 0; i < userNum; i++) {
			System.out.println("Please enter the company to make the car: ");
			make = scan.nextLine();
			System.out.println("Please enter the model of the car: ");
			model = scan.nextLine();
			System.out.println("Please enter the cars year: ");
			year = scan.nextInt();
			scan.nextLine();
			System.out.println("Please enter the price of the car: ");
			price = scan.nextDouble();
			scan.nextLine();
			
			
			cars.add(new CarClass(make, model, year, price));
		}
		
		System.out.println("Current Inventory: ");
		for(CarClass list: cars) {
			System.out.println(list);
		}
	}

}
