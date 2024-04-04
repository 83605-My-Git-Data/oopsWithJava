package com.sunbeam.AS3q2;

import java.util.Scanner;

public class Car {
	private double kmPerDay;
	private double costPerKmPetrol;
	private double avgKmPerLit;
	private int parkingFeesAday;
	private int tollPerDay;
	
	
	
	
	public Car(double kmPerDay, double costPerKmPetrol, double avgKmPerLit, int parkingFeesAday, int tollPerDay) {
		super();
		this.kmPerDay = kmPerDay;
		this.costPerKmPetrol = costPerKmPetrol;
		this.avgKmPerLit = avgKmPerLit;
		this.parkingFeesAday = parkingFeesAday;
		this.tollPerDay = tollPerDay;
	}
	
	public Car() {
		
	}
	
	
	public double getKmPerDay() {
		return kmPerDay;
	}
	public void setKmPerDay(double kmPerDay) {
		this.kmPerDay = kmPerDay;
	}
	public double getCostPerKmPetrol() {
		return costPerKmPetrol;
	}
	public void setCostPerKmPetrol(double costPerKmPetrol) {
		this.costPerKmPetrol = costPerKmPetrol;
	}
	public double getAvgKmPerLit() {
		return avgKmPerLit;
	}
	public void setAvgKmPerLit(double avgKmPerLit) {
		this.avgKmPerLit = avgKmPerLit;
	}
	public int getParkingFeesAday() {
		return parkingFeesAday;
	}
	public void setParkingFeesAday(int parkingFeesAday) {
		this.parkingFeesAday = parkingFeesAday;
	}
	public int getTollPerDay() {
		return tollPerDay;
	}
	public void setTollPerDay(int tollPerDay) {
		this.tollPerDay = tollPerDay;
	}
	
	
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much your car travels a day in km: ");
		kmPerDay = sc.nextDouble();
		System.out.println("What is the cost per lit of petrol: ");
		costPerKmPetrol = sc.nextDouble();
		System.out.println("What is average of your car: ");
		avgKmPerLit = sc.nextDouble();
		System.out.println("What is Parking fees for a single day: ");
		parkingFeesAday = sc.nextInt();
		System.out.println("How much toll you pay per day in RS: ");
		tollPerDay = sc.nextInt();
		
	}
	
	
	public void displayData() {
		System.out.println("Car KM/DAY: "+kmPerDay);
		System.out.println("Pertrol price per lit: "+costPerKmPetrol);
		System.out.println("Avg of your car: "+avgKmPerLit);
		System.out.println("Parking fees: "+parkingFeesAday);
		System.out.println("Toll Per day: "+tollPerDay);
		
	}
	
	
	
	
	
	
	

}
