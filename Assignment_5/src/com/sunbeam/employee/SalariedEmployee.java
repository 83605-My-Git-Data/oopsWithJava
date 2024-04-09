package com.sunbeam.employee;

import java.util.Scanner;

public class SalariedEmployee extends Employee implements acceptData{
	private double weeklySalary;

	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}


	
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
		System.out.println("Enter weekly salary: ");
		weeklySalary = sc.nextDouble();
	}

	@Override
	public void calculateS() {
		System.out.println("Salary: "+weeklySalary);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName: "+getFirstName()+" LastName: "+getLastName()+" SSN: "+getSSN();
	}
	
	
	
	
	
	
	
	

	
	
	
	

	
	
	
	
	

}
