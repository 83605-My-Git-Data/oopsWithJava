package com.sunbeam.employee;

import java.util.Scanner;

public class HourlyEmployee extends Employee implements acceptData {
	private double hourlyWage;
	private int hoursWorked;
	
	
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter hourlyWage: ");
		hourlyWage = sc.nextDouble();
		System.out.println("Enter total hrs worked: ");
		hoursWorked = sc.nextInt();
	}
	
	@Override
	public void calculateS() {
		
		if(hoursWorked <= 40) {
			System.out.println("Total salary: "+hourlyWage*hoursWorked);
		}
		
		else if(hoursWorked > 40) {
			double totalSalary = (40 * hourlyWage) + ((hoursWorked - 40) * (hourlyWage * 1.5));
			int roundedSalary = (int) Math.round(totalSalary);
			System.out.println("Total Salary: "+roundedSalary);
		}
		
		
	}
	
	@Override
	public String toString() {
		
		return "FirstName: "+getFirstName()+" LastName: "+getLastName()+" SSN: "+getSSN();
	}
	
	
	
	
	
	
	
	
	
	

}
