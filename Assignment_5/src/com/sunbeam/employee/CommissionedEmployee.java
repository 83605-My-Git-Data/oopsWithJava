package com.sunbeam.employee;

import java.util.Scanner;

public class CommissionedEmployee extends Employee implements acceptData{
	private double grossSales;
	private int commissionRate;
	
	
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public int getComissionRate() {
		return commissionRate;
	}
	public void setComissionRate(int comissionRate) {
		this.commissionRate = comissionRate;
	}
	
	
	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter gross sales: ");
		grossSales = sc.nextDouble();
		System.out.println("Enter commission rate: ");
		commissionRate = sc.nextInt();
	}

	@Override
	public void calculateS() {
		System.out.println("Total Salary: "+commissionRate*grossSales);
	}
	
	public String toString() {
		
		return "FirstName: "+getFirstName()+" LastName: "+getLastName()+" SSN: "+getSSN();
	}
	
	
	
	
	
	
	
	

}
