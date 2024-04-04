package com.sunbeam.AS3q2;

//Q2. Create an application that calculates your daily driving cost, so that you can estimate how much
//money could be saved by car pooling, which also has other advantages such as reducing carbon
//emissions and reducing traffic congestion. The application should input the following information
//and display the user’s cost per day of driving to work: 
//a) Total miles driven per day. 
//b) Cost per gallon of gasoline. 
//c) Average miles per gallon. 
//d) Parking fees per day. 
//e) Tolls per day.

public class q2 {
	public static void main(String[] args) {
		Car car = new Car();
		
		car.acceptData();
		car.displayData();
		
		double price = 0;
		double avgpricePerKm = car.getKmPerDay()/car.getAvgKmPerLit();
		price = car.getTollPerDay()+car.getParkingFeesAday()+   car.getCostPerKmPetrol()*avgpricePerKm;
		
		System.out.println("Total Daily driving cost: "+price);
		System.out.println("YOU CAN SAVE RS "+price+" A DAY IF YOU TRAVEL BY PUBLIC TRANSPORT");
	}
	
	
//	5*104+120

}
