package com.sunbeam.employee;

import java.util.Scanner;

public class BaseCommissioned extends CommissionedEmployee implements acceptData{
	
	private double baseSalary;
	

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("Enter base salary: ");
		baseSalary = sc.nextDouble();
	}


	@Override
	public void calculateS() { //no need to call this
		
		System.out.println("Salary without reward: "+((getComissionRate()*getGrossSales())));
	}
	
	public void reward() {
		double sal;
		 sal = (getComissionRate()*getGrossSales())+(baseSalary+(baseSalary*0.10));
		
		System.out.println("Salary with reward: "+ sal);
		
	}
	
public String toString() {
		
		return "FirstName: "+getFirstName()+" LastName: "+getLastName()+" SSN: "+getSSN();
	}
	
	

}
